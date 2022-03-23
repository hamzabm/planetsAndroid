package com.uppa.monapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "planet_info")
public class PlanetInfo{
	@ColumnInfo(name = "seemore")
	private String seemore;
	@ColumnInfo(name = "name")
	private String name;
	@ColumnInfo(name = "description")
	private String description;
	@ColumnInfo(name = "logo")
	private String logo;

	@PrimaryKey
	@ColumnInfo(name = "id")
	private int id;
	private int planetId;

	public void setSeemore(String seemore){
		this.seemore = seemore;
	}

	public String getSeemore(){
		return seemore;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPlanetId(int planetId){
		this.planetId = planetId;
	}

	public int getPlanetId(){
		return planetId;
	}
}
