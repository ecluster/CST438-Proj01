package com.example.cst438proj01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAcc extends AppCompatActivity implements View.OnClickListener {
    View btnCreatAcc;
    private UserDAO mUserDAO;
    private User userCheck;
    EditText etUsername;
    EditText etPassword;
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        btnCreatAcc = findViewById(R.id.btnCreateAcc);
        btnCreatAcc.setOnClickListener(this);
        getDatabase();
    }

    private void getDatabase(){
        mUserDAO = Room.databaseBuilder(this, database.class, database.USER_TABLE)
                .allowMainThreadQueries()
                .build()
                .getIneptDAO();
    }

    public void onClick(View v) {
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        username = etUsername.getText().toString();
        password = etPassword.getText().toString();

        if(hasInput(username,password)){
            if(isUsernameEmpty(username) && !isPasswordEmpty(password)){
                Toast.makeText(this, "Username empty",Toast.LENGTH_SHORT).show();
            } else if(!isUsernameEmpty(username) && isPasswordEmpty(password)){
                Toast.makeText(this, "Password empty",Toast.LENGTH_SHORT).show();
            } else if(!isUsernameEmpty(username) && !isPasswordEmpty(password)){
                if(!checkForUserInDataBase()){
                    Toast.makeText(getApplicationContext(),"Inavlid username",Toast.LENGTH_SHORT).show();
                } else{
                    User user = new User(username,password);
                    user.setUserName(username);
                    user.setPassword(password);
                    mUserDAO.insert(user);
                    Toast.makeText(getApplicationContext(),"User registered",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
            }
        } else{
            Toast.makeText(this, "Username and password empty",Toast.LENGTH_SHORT).show();
        }
    }

    private boolean checkForUserInDataBase() {
        userCheck= mUserDAO.getUserByUsername(username);
        if(userCheck!=null){
            Toast.makeText(this, " Username Already in use",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public static boolean isUsernameEmpty(String u) {
        return u.length()==0;
    }
    public static boolean isPasswordEmpty(String p) {
        return p.length()==0;
    }

    public static boolean hasInput(String u, String p) {
        if (isUsernameEmpty(u) && isPasswordEmpty(p)){
            return false;
        } else if (isUsernameEmpty(u) || isPasswordEmpty(p)) {
            return true;
        } else if (isUsernameEmpty(u)) {
            return false;
        } else if (isPasswordEmpty(p)) {
            return false;
        } else {
            return true;
        }
    }
}
