package com.example.a06_intent_dan_parsing_data;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    // Deklarasi Komponen
    Intent intent;
    Button btnIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.hard_code_layout);

        // inisialisasi komponen
        btnIntent = findViewById(R.id.btn_intent);

        // event click btnIntent
        btnIntent.setOnClickListener( v ->{
            // explisit intent
            intent = new Intent(MainActivity.this, IntentActivity.class);
            intent.putExtra("message", "Silahkan belajar intent!!");
            startActivity(intent);
        });
    }
}