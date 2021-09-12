package com.example.cst438proj01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private String mUsernameString;
    private String mPasswordString;
    private User mUser;
    private EditText etUsername;
    private EditText etPassword;
    private UserDAO ineptDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDatabase();
        View btnSubmit = findViewById(R.id.btnSubmit);
        View btnCreatAcc = findViewById(R.id.btnCreateAcc);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);




        btnSubmit.setOnClickListener(this);
    }

    public void onClick(View v) {
        getValuesFromDisplay();
        if (checkForUserInDataBase() == true) {
            if (!validatePassword()) {
                Toast.makeText(MainActivity.this, "Invalid password", Toast.LENGTH_SHORT).show();
            }else{
                // send user to the new page
                // Change HomeActivity.class later with other branches
                Intent i = new Intent(this, JobSearch.class);
                i.putExtra("UserID", mUser.getUserName());
                startActivity(i);
                Toast.makeText(this, "Log In good", Toast.LENGTH_SHORT).show();
            }
      /*  if (v.getId() == R.id.btnSubmit) {
            // send user to the new page
            // Change HomeActivity.class later with other branches
            Intent i = new Intent(this, JobSearch.class);
            startActivity(i);
            Toast.makeText(this, "Log In good", Toast.LENGTH_SHORT).show();
        }*/
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