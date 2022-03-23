package com.uppa.monapp.model;

public class PlanetInfo{
	private String seemore;
	private String name;
	private String description;
	private String logo;
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
