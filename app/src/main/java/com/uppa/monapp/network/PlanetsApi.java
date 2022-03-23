package com.uppa.monapp.network;

import com.uppa.monapp.model.Planet;
import com.uppa.monapp.model.PlanetInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface PlanetsApi {
    @GET("planetapi/planets")
    Call<List<Planet>> getPlanets();

    @GET("planetapi/planets/{idplanet}/infos")
    Call<List<PlanetInfo>> getPlanetInfo(@Path("idplanet") int id);
}
