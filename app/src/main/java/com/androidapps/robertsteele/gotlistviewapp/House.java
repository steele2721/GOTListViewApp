package com.androidapps.robertsteele.gotlistviewapp;

public class House {

    private String name;
    private String lord;
    private String words;
    private String kingdom;
    private int imageResourceId;

    public static final House[] houses = {
          new House("Stark", "Winter Is Coming", R.drawable.stark),
            new House("Lannister", "A Lannister Always Pays Its debts", R.drawable.lannister),
            new House("Targaryen", "Burn them all", R.drawable.targaryen)
    };

    private House(String name, String words, int imageResourceId) {
        this.name = name;
        this.words = words;
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
