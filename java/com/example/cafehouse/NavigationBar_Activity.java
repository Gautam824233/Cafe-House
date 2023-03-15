package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NavigationBar_Activity extends AppCompatActivity {
    Button Profile;
    ImageButton Aaloo, Dosa, Roti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_bar);

        Profile = findViewById(R.id.profile);
        Aaloo = findViewById(R.id.parotha);
        Dosa = findViewById(R.id.dosa);
        Roti = findViewById(R.id.roti);

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NavigationBar_Activity.this, Profile_activity.class);
                startActivity(intent);
            }
        });
        Aaloo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NavigationBar_Activity.this,Aalu_paratha_Activity.class);
                startActivity(intent);
            }
        });
        Dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NavigationBar_Activity.this, Dosa_activity.class);
                startActivity(intent);
            }
        });
        Roti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NavigationBar_Activity.this,Roti_activity.class);
                startActivity(intent);
            }
        });

    }
}