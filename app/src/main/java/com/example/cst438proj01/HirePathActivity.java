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

public class HirePathActivity extends AppCompatActivity {

    private TextView tvPaths;
    private JsonPlaceHolderAPI jsonPlaceHolderAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hirepath);

        tvPaths = findViewById(R.id.tvPaths);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.usajobs.gov/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderAPI = retrofit.create(JsonPlaceHolderAPI.class);

        getHirePaths();
    }

    private void getHirePaths() {
        Call<HirePath> call = jsonPlaceHolderAPI.getHirePath();
        call.enqueue(new Callback<HirePath>() {
            @Override
            public void onResponse(Call<HirePath> call, Response<HirePath> response) {
                if (!response.isSuccessful()) {
                    tvPaths.setText("Code: " + response.code());
                    return;
                }

                for (int i = 0; i < 21; i++) {
                    String content = "";
                    content += "Code: " + response.body().getHirePathCode(i) + "\n";
                    content += "Value: " + response.body().getHirePathValue(i) + "\n\n";
                    tvPaths.append(content);
                }
            }

            @Override
            public void onFailure(Call<HirePath> call, Throwable t) {
                tvPaths.setText("OnFailure: " + t.getMessage());
            }
        });
    }
}
