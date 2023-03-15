package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class SignUp_Activity extends AppCompatActivity {
Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        register = findViewById(R.id.btnregister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp_Activity.this, "Registered successfully", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignUp_Activity.this, SettingPage_Activity.class);
                startActivity(intent);}
        });

        //Objects.requireNonNull(getSupportActionBar()).setTitle("Sign Up");
    }
}