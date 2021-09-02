package com.example.cst438proj01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btnSubmit = findViewById(R.id.btnSubmit);
        View btnCreatAcc = findViewById(R.id.btnCreateAcc);
        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);

        btnSubmit.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnSubmit) {
            // send user to the new page
            // Change HomeActivity.class later with other branches
            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);
            Toast.makeText(this, "Log In good", Toast.LENGTH_SHORT).show();
        }
    }
}