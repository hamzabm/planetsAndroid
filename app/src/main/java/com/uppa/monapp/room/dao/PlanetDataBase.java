package com.uppa.monapp.room.dao;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.uppa.monapp.model.Planet;
import com.uppa.monapp.model.PlanetInfo;

@Database(entities = {Planet.class, PlanetInfo.class}, version = 1)
public abstract class PlanetDataBase extends RoomDatabase {
    public abstract PlanetDao planetDao();
    public abstract PlanetInfoDao planetInfoDao();
}
