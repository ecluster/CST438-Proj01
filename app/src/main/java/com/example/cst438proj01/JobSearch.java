package com.example.cst438proj01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class JobSearch extends AppCompatActivity implements View.OnClickListener {
    private UserDAO ineptDAO;
    private String mUsernameString;
    private User mUser;
    View btnLogout;


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
    }

    @Override
    public void onClick(View v) {
        EditText cin_job;
        cin_job = (EditText)findViewById(R.id.search_job);

        if(v.getId() == R.id.submit_btn){
            Intent i = new Intent(this, MainActivity.class);
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
