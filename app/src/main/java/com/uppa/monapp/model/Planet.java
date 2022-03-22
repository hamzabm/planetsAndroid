package com.uppa.monapp.model;

public class Planet {
    public String nom;
    public int distance;
    public int imageId;

    public Planet(String nom, int distance, int imageId) {
        this.nom = nom;
        this.distance = distance;
        this.imageId = imageId;
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}


