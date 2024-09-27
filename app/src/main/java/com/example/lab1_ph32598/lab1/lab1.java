package com.example.lab1_ph32598.lab1;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lab1_ph32598.R;

public class lab1 extends ComponentActivity {
    TextView tv1;
    @Override
    @SuppressLint("")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        tv1 = findViewById(R.id.lab1tv1);
    }
}