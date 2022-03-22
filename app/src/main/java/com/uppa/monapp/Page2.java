package com.uppa.monapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.uppa.monapp.databinding.ActivityPage2Binding;

public class Page2 extends AppCompatActivity {
        ActivityPage2Binding ui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityPage2Binding.inflate(getLayoutInflater());
       Intent i = getIntent();
       String prenom = i.getStringExtra("prenom");
        String nom = i.getStringExtra("nom");
        TextView helloTv = ui.welcomeTV;
        Button goBack = ui.gotoMain;
        EditText text= ui.textToReturn;
        goBack.setOnClickListener(v -> {
            Log.d("Log","click");
            Intent returnIntent = new Intent();
            returnIntent.putExtra("text",text.getText().toString());
            setResult(Activity.RESULT_OK,returnIntent);
            finish();
        });
        helloTv.setText(getString(R.string.hello_name,nom,prenom));
        setContentView(ui.getRoot());
    }
}