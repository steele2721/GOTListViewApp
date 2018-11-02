package com.androidapps.robertsteele.gotlistviewapp;

public class House {

    private String name;
    private String lord;
    private String words;
    private String kingdom;
    private int imageResourceId;

    public static final House[] houses = {
          new House("Stark", "John Snow", R.drawable.stark),
            new House("Lannister", "Cerci Lannister", R.drawable.lannister),
            new House("Targaryen", "Dani Targaryen", R.drawable.targaryen)
    };

    private House(String name, String lord, int imageResourceId) {
        this.name = name;
        this.lord = lord;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }
    public String getWords() {
        return words;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }

}
