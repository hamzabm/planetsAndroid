package com.uppa.monapp.network;

import com.uppa.monapp.model.Planet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface PlanetsApi {
    @GET()
    Call<List<Planet>> getPlanets(@Url  String url);
}
