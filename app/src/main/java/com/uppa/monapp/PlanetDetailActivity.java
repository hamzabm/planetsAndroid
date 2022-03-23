package com.uppa.monapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.uppa.monapp.databinding.ActivityMainBinding;
import com.uppa.monapp.databinding.ActivityPlanetDetailBinding;
import com.uppa.monapp.model.Planet;
import com.uppa.monapp.model.PlanetInfo;
import com.uppa.monapp.network.PlanetsApi;
import com.uppa.monapp.room.dao.PlanetDataBase;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PlanetDetailActivity extends AppCompatActivity {
    ActivityPlanetDetailBinding ui;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityPlanetDetailBinding.inflate(getLayoutInflater());
        int id = getIntent().getIntExtra("id", -1);
        Log.d("HamzaLog", "Id Planet : " + id);
        PlanetApplication planetApplication = ( (PlanetApplication) getApplicationContext() );


        PlanetsApi service = planetApplication.getRetrofit().create(PlanetsApi.class);
        Call<List<PlanetInfo>> planetsCall = service.getPlanetInfo(id);
        planetsCall.enqueue(new Callback<List<PlanetInfo>>() {
            @Override
            public void onResponse(Call<List<PlanetInfo>> call, Response<List<PlanetInfo>> response) {
                PlanetInfo pl = response.body().get(0);
                if (planetApplication.getDb().planetInfoDao().getPlanetInfoByid(id)!=null) {
                    planetApplication.getDb().planetInfoDao().deleteOneByIdPlanet(id);
                }
                planetApplication.getDb().planetInfoDao().insertAll(pl);
                ui.nom.setText(pl.getName());
                Glide.with(ui.getRoot()).load(pl.getLogo()).into(ui.logo);
                ui.description.setText(pl.getDescription());
                ui.gotoUrl.setOnClickListener(v -> {
                    String url = pl.getSeemore();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                });
            }

            @Override
            public void onFailure(Call<List<PlanetInfo>> call, Throwable t) {
                if (planetApplication.getDb().planetInfoDao().getPlanetInfoByid(id)!=null) {
                    PlanetInfo pl = planetApplication.getDb().planetInfoDao().getPlanetInfoByid(id);
                    ui.nom.setText(pl.getName());
                    Glide.with(ui.getRoot()).load(pl.getLogo()).into(ui.logo);
                    ui.description.setText(pl.getDescription());
                    ui.gotoUrl.setOnClickListener(v -> {
                        String url = pl.getSeemore();
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    });
                }else {
                    Toast.makeText(getApplicationContext(),"pas de réseau", Toast.LENGTH_LONG).show();
                }


            }
        });
        setContentView(ui.getRoot());
    }
}