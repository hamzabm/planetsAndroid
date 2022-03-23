package com.uppa.monapp;

import android.app.Application;

import androidx.room.Room;

import com.uppa.monapp.room.dao.PlanetDataBase;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PlanetApplication  extends Application {
    PlanetDataBase db;
    Retrofit retrofit;

    public PlanetDataBase getDb() {
        return db;
    }



    public Retrofit getRetrofit() {
        return retrofit;
    }



    @Override
    public void onCreate() {
        super.onCreate();

         db = Room.databaseBuilder(getApplicationContext(),
                PlanetDataBase.class, "planet_db").allowMainThreadQueries().build();
         retrofit = new Retrofit.Builder()
                .addConverterFactory( GsonConverterFactory.create())
                .baseUrl("https://my-json-server.typicode.com/hamzabm/")
                .build();
    }
}
