package com.example.cst438proj01;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TempActivity extends AppCompatActivity {

    private TextView tvResult;
    String jobs;
    private JsonPlaceHolderAPI jsonPlaceHolderAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        tvResult = findViewById(R.id.tvResult);
        checkJob();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.usajobs.gov/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderAPI = retrofit.create(JsonPlaceHolderAPI.class);
        getJobs();
    }

    private void checkJob(){
        jobs = getIntent().getStringExtra("job");

    }

    private void getJobs() {
        Call<Job> call = jsonPlaceHolderAPI.getJob(jobs, "");

        call.enqueue(new Callback<Job>() {
            @Override
            public void onResponse(Call<Job> call, Response<Job> response) {
                if (!response.isSuccessful()) {
                    tvResult.setText("Code: " + response.code());
                    return;
                }

                for (int i = 0; i < 10; i++) {
                    String content = "";
                    content += "Job Title: " + response.body().getPositionTitle(i) + "\n";
                    content += "Job ID: " + response.body().getPositionId(i) + "\n";
                    content += "Location Name: " + response.body().getLocationName(i) + "\n\n";
                    tvResult.append(content);
                }

            }

            @Override
            public void onFailure(Call<Job> call, Throwable t) {
                tvResult.setText("OnFailure: " + t.getMessage());
            }
        });
    }
}
