package com.example.cst438proj01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class JobSearch extends AppCompatActivity implements View.OnClickListener {
    private UserDAO ineptDAO;
    private String mUsernameString;
    View btnLogout;
    View btnUser;
    View submitBtn;
    private User mUser;
    EditText cin_job;
    private String job;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        getDatabase();
        checkForUser();
        mUsernameString=getIntent().getStringExtra("username");
        submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(this);
        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(this);

        btnUser = findViewById(R.id.btnUser);
        btnUser.setOnClickListener(this);
        mUser=ineptDAO.getUserByUsername(mUsernameString);
        Toast.makeText(this, "User " +mUser.getUserName()+" found", Toast.LENGTH_SHORT).show();

        //mUser.setUserName("testuser1");
        //ineptDAO.update(mUser);
    }

    @Override
    public void onClick(View v) {
        cin_job = (EditText)findViewById(R.id.search_job);
        job = "" + cin_job.getText().toString();

        if(v.getId() == R.id.submit_btn){
            Intent i = new Intent(this, TempActivity.class);
            i.putExtra("job",job);
            startActivity(i);
        }  if (v.getId() == R.id.btnLogout) {
            finish();
        }  if (v.getId() == R.id.btnUser){
            //Toast.makeText(this, "User " +mUser.getUserName()+" found", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, UserProfile.class);
            i.putExtra("username",mUser.getUserName());
            startActivity(i);
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
