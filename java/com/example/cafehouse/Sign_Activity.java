package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class Sign_Activity extends AppCompatActivity {


    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Login = findViewById(R.id.btnopen);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Sign_Activity.this, "Login", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Sign_Activity.this, NavigationBar_Activity.class);
                startActivity(intent);
            }
        });
        //Objects.requireNonNull(getSupportActionBar()).setTitle(R.string.gautam);
    }
}