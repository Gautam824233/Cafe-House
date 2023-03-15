package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Aalu_paratha_Activity extends AppCompatActivity {
    ImageButton Dosa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aalu_paratha);

        Dosa = findViewById(R.id.dosa1);
        Dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Aalu_paratha_Activity.this,Dosa_activity.class);
                startActivity(intent);
            }
        });
    }
}