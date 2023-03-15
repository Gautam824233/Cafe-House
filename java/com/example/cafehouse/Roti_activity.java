package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Roti_activity extends AppCompatActivity {
    ImageButton Dosa,Parotha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roti);
        Dosa = findViewById(R.id.dosa);
        Parotha = findViewById(R.id.parotha);

        Dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Roti_activity.this,Dosa_activity.class);
                startActivity(intent);
            }
        });
        Parotha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Roti_activity.this,Aalu_paratha_Activity.class);
                startActivity(intent);
            }
        });
    }
}