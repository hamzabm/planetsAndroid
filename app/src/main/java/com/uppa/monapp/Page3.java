package com.uppa.monapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uppa.monapp.databinding.ActivityPage3Binding;

public class Page3 extends AppCompatActivity {
    ActivityPage3Binding ui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityPage3Binding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
    }
}