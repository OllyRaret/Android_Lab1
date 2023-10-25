package com.example.lab1android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText colorEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorEditText = findViewById(R.id.colorEditText);
        Button launchButton = findViewById(R.id.launchButton);

        launchButton.setOnClickListener(v -> {
            String color = colorEditText.getText().toString().toLowerCase();
            Intent intent = new Intent(MainActivity.this, ColorActivity.class);
            intent.putExtra("color", color);
            startActivity(intent);
        });
    }
}