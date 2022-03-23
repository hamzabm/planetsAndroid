package com.uppa.monapp.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.uppa.monapp.model.Planet;
import com.uppa.monapp.model.PlanetInfo;

import java.util.List;

@Dao
public interface PlanetInfoDao {
    @Query("SELECT * FROM planet_info")
    List<PlanetInfo> getAll();

    @Query("SELECT * FROM planet_info where planetId = :idPlanet")
    PlanetInfo getPlanetInfoByid(int idPlanet);

    @Insert
    void insertAll(PlanetInfo... planetsInfos);


    @Query("DELETE FROM planet_info where  planetId= :idPlanet")
    void deleteOneByIdPlanet(int idPlanet);
}
