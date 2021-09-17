package com.example.cst438proj01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JobSearch extends AppCompatActivity implements View.OnClickListener {
    private UserDAO ineptDAO;
    private String mUsernameString;
    private User mUser;
    View btnLogout;
    EditText cin_job;
    private String job;
    private TextView tvResult;
    private JsonPlaceHolderAPI jsonPlaceHolderAPI;


    List<Job> jobList;
    private JobAdapter jobAdapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        getDatabase();
        checkForUser();
        mUser=ineptDAO.getUserByUsername(mUsernameString);
        View submitBtn = findViewById(R.id.submit_btn);
        btnLogout = findViewById(R.id.btnLogout);
        submitBtn.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
      
        //Toast.makeText(this, "User " +mUser.getUserName()+" found",Toast.LENGTH_SHORT).show();

        //tvResult = findViewById(R.id.tvResult);

        jobList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        jobAdapter = new JobAdapter(getApplicationContext(),jobList);
        recyclerView.setAdapter(jobAdapter);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.usajobs.gov/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderAPI = retrofit.create(JsonPlaceHolderAPI.class);

    }

    @Override
    public void onClick(View v) {
        cin_job = (EditText)findViewById(R.id.search_job);
        job = "" + cin_job.getText().toString();

        if(v.getId() == R.id.submit_btn){
            Intent i = new Intent(this, TempActivity.class);
            i.putExtra("job",job);
            startActivity(i);
        } else if (v.getId() == R.id.btnLogout) {
            finish();
        }
    }

    public void getDatabase() {
        ineptDAO = Room.databaseBuilder(this, database.class, database.USER_TABLE)
                .allowMainThreadQueries()
                .build()
                .getIneptDAO();

    }
    private void checkForUser() {
        mUsernameString= getIntent().getStringExtra("UserID");
    }
}
