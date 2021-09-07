package com.example.cst438proj01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAcc extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        View btnCreatAcc = findViewById(R.id.btnCreateAcc);
        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);

        btnCreatAcc.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btnCreateAcc){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
