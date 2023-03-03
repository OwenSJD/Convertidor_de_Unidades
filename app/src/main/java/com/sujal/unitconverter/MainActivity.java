package com.sujal.unitconverter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar action_bar = getSupportActionBar();
        if (action_bar != null) {
            action_bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));
        }

        CardView area_card, length_card, temperature_card, speed_card, frequency_card, mass_card;

        area_card = findViewById(R.id.cardView_area);
        length_card = findViewById(R.id.cardView_length);
        temperature_card = findViewById(R.id.cardView_temperature);
        speed_card = findViewById(R.id.cardView_speed);
        frequency_card = findViewById(R.id.cardView_frequency);


        area_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AreaActivity.class));
            }
        });

        length_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LongitudActivity.class));
            }
        });

        temperature_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TemperaturaActivity.class));
            }
        });

        speed_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VelocidadActivity.class));
            }
        });

        frequency_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FrequenciaActivity.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


}