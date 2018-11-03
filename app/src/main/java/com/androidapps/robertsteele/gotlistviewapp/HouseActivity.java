package com.androidapps.robertsteele.gotlistviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HouseActivity extends AppCompatActivity {

    public static final String DRINK_ID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);
        int houseId = getIntent().getExtras().getInt(DRINK_ID);
        House house = House.houses[houseId];
        ImageView houseImage = findViewById(R.id.house_image);
        houseImage.setImageResource(house.getImageResourceId());
        TextView houseName = findViewById(R.id.house_name);
        houseName.setText(house.getName());
        TextView houseWords = findViewById(R.id.house_words);
        houseWords.setText(house.getWords());

    }
}
