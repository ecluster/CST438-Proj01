package com.example.cst438proj01;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * PositionScheduleActivity --- program to display all position schedules
 * @author    Edward Cluster
 */

public class PositionScheduleActivity extends AppCompatActivity {

    private TextView tvSchedule;
    private JsonPlaceHolderAPI jsonPlaceHolderAPI;

    /**
     * create the activity to display position schedule results
     * @param savedInstanceState A Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positionschedule);

        tvSchedule = findViewById(R.id.tvSchedule);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.usajobs.gov/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderAPI = retrofit.create(JsonPlaceHolderAPI.class);

        getPositionSchedules();
    }

    /**
     * Get the position schedules from api endpoint
     */
    private void getPositionSchedules() {
        Call<PositionSchedule> call = jsonPlaceHolderAPI.getPositionSchedule();
        call.enqueue(new Callback<PositionSchedule>() {
            @Override
            public void onResponse(Call<PositionSchedule> call, Response<PositionSchedule> response) {
                if (!response.isSuccessful()) {
                    tvSchedule.setText("Code: " + response.code());
                    return;
                }

                for (int i = 0; i < 6; i++) {
                    String content = "";
                    content += "Code: " + response.body().getPositionScheduleCode(i) + "\n";
                    content += "Value: " + response.body().getPositionScheduleValue(i) + "\n\n";
                    tvSchedule.append(content);
                }
            }

            @Override
            public void onFailure(Call<PositionSchedule> call, Throwable t) {
                tvSchedule.setText("OnFailure: " + t.getMessage());
            }
        });
    }
}
