package com.uppa.monapp.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.uppa.monapp.model.Planet;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface PlanetDao {
    @Query("SELECT * FROM planet")
    List<Planet> getAll();

    @Insert
    void insertAll(ArrayList<Planet> planets);

    @Query("DELETE FROM planet")
    void deleteAll();
}
