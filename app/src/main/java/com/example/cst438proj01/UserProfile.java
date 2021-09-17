package com.example.cst438proj01;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class UserProfile extends AppCompatActivity implements View.OnClickListener {
    EditText etName;
    View btnChange;
    private String name;
    private UserDAO mUserDAO;
    private User mUser;
    private User mPassword;
    private String mUsernameString;
    private UserDAO ineptDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getDatabase();

        //add display name
        mUsernameString= getIntent().getStringExtra("username");
        mUser=ineptDAO.getUserByUsername(mUsernameString);
        etName = findViewById(R.id.editUser);
        btnChange = findViewById(R.id.btnChange);
        btnChange.setOnClickListener(this);
        //mUser=ineptDAO.getUserByUsername(mUsernameString);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnChange) {
            name = etName.getText().toString();
            mUser.setUserName(name);
            ineptDAO.update(mUser);
            Toast.makeText(this, "Profile name updated", Toast.LENGTH_SHORT).show();
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
