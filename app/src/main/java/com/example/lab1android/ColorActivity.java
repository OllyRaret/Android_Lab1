package com.example.lab1android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.graphics.Color;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        LinearLayout backgroundLayout = findViewById(R.id.backgroundLayout);
        String color = getIntent().getStringExtra("color");

        if (color != null) {
            switch (color) {
                case "red":
                    backgroundLayout.setBackgroundColor(Color.RED);
                    break;
                case "green":
                    backgroundLayout.setBackgroundColor(Color.GREEN);
                    break;
                case "blue":
                    backgroundLayout.setBackgroundColor(Color.BLUE);
                    break;
            }
        }
    }
}