package com.example.cst438proj01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private String mUsernameString;
    private String mPasswordString;
    private User mUser;
    private EditText etUsername;
    private EditText etPassword;
    private UserDAO ineptDAO;
    View btnHirePath;
    View btnPositionSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDatabase();
        populateDB();
        View btnSubmit = findViewById(R.id.btnSubmit);
        View btnCreatAcc = findViewById(R.id.btnCreateAcc);

        View tvResult = findViewById(R.id.tvResult);
        View btnTemp = findViewById(R.id.btnTemp);

        btnSubmit.setOnClickListener(this);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);


        btnHirePath = findViewById(R.id.btnHirePath);
        btnPositionSchedule = findViewById(R.id.btnPositionSchedule);

        btnSubmit.setOnClickListener(this);
        btnCreatAcc.setOnClickListener(this);
        btnTemp.setOnClickListener(this);
        btnHirePath.setOnClickListener(this);
        btnPositionSchedule.setOnClickListener(this);

    }

    private void populateDB() {
        List<User>user=ineptDAO.ineptGetAllUsers();
        if(user.size()<=1){
            ineptDAO.insert(new User("testuser1","testuser1"));
            ineptDAO.insert(new User("admin2","admin2"));
        }
    }

    public void onClick(View v) {
        getValuesFromDisplay();
        if (checkForUserInDataBase() == true) {
            if (!validatePassword()) {
                Toast.makeText(MainActivity.this, "Invalid password", Toast.LENGTH_SHORT).show();
            }else if (v.getId() == R.id.btnSubmit) {
                // send user to the new page
                Intent i = new Intent(this, JobSearch.class);
                i.putExtra("username",mUser.getUserName());
                startActivity(i);
                Toast.makeText(this, "Log In good", Toast.LENGTH_SHORT).show();

            }
        }

        if(v.getId() == R.id.btnCreateAcc){
            //Send user to create account page
            Intent i = new Intent(this, CreateAcc.class);
            startActivity(i);

        } else if (v.getId() == R.id.btnTemp) {
            Intent i = new Intent(this, TempActivity.class);
            startActivity(i);
            Toast.makeText(this, "Going to temp", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.btnHirePath) {
            Intent i = new Intent(this, HirePathActivity.class);
            startActivity(i);
            Toast.makeText(this, "Going to Hire Paths", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.btnPositionSchedule) {
            Intent i = new Intent(this, PositionScheduleActivity.class);
            startActivity(i);
            Toast.makeText(this, "Going to Schedules", Toast.LENGTH_SHORT).show();
        }
    }
    private void getValuesFromDisplay() {
        mUsernameString=etUsername.getText().toString();
        mPasswordString=etPassword.getText().toString();
    }
    private boolean validatePassword(){
        return mUser.getPassword().equals(mPasswordString);
    }
    public boolean checkForUserInDataBase() {
        mUser =ineptDAO.getUserByUsername(mUsernameString);
        if(mUser==null){
            Toast.makeText(this, "no user " +mUsernameString+" found",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    public void getDatabase() {
        ineptDAO = Room.databaseBuilder(this, database.class, database.USER_TABLE)
                .allowMainThreadQueries()
                .build()
                .getIneptDAO();

    }
    //tests to see if git config worked

}