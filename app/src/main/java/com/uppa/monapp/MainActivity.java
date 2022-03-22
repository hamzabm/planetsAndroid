package com.uppa.monapp;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uppa.monapp.adapters.PlanetsAdapter;
import com.uppa.monapp.databinding.ActivityMainBinding;
import com.uppa.monapp.model.Planet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding ui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ui = ActivityMainBinding.inflate(getLayoutInflater());
        ArrayList<Planet> planets = new ArrayList<Planet>();
        planets.add(new Planet("Mercure",58,R.drawable.mercure));
        planets.add(new Planet("Vénus",108,R.drawable.venus));
        planets.add(new Planet("Terre",150,R.drawable.terre));
        planets.add(new Planet("Mercure",58,R.drawable.mercure));
        planets.add(new Planet("Vénus",108,R.drawable.venus));
        planets.add(new Planet("Terre",150,R.drawable.terre));
        planets.add(new Planet("Mercure",58,R.drawable.mercure));
        planets.add(new Planet("Vénus",108,R.drawable.venus));
        planets.add(new Planet("Terre",150,R.drawable.terre));
        planets.add(new Planet("Mercure",58,R.drawable.mercure));
        planets.add(new Planet("Vénus",108,R.drawable.venus));
        planets.add(new Planet("Terre",150,R.drawable.terre));
        planets.add(new Planet("Mercure",58,R.drawable.mercure));
        planets.add(new Planet("Vénus",108,R.drawable.venus));
        planets.add(new Planet("Terre",150,R.drawable.terre));
        LinearLayoutManager  lm = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        ui.planetsRv.setLayoutManager(lm);
        PlanetsAdapter planetsAdapter = new PlanetsAdapter(planets);
        planetsAdapter.setOnItemClickListener(postition -> {
            Log.d("Log","Planet "+ planets.get(postition).getNom() +" clicked" );
        });
        ui.planetsRv.setAdapter(planetsAdapter);
        setContentView(ui.getRoot());
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Log","OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Log","OnResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Log","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Log","OnStop");
    }
}