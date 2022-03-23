package com.uppa.monapp.model;

import com.google.gson.annotations.SerializedName;

public class Planet {
    public String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int id;
    public int distance;
    @SerializedName("logo")
    public String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Planet(String nom, int id, int distance, String imageUrl) {
        this.nom = nom;
        this.id = id;
        this.distance = distance;
        this.imageUrl = imageUrl;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


}


