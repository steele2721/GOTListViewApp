package com.androidapps.robertsteele.gotlistviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HouseCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayAdapter<House> houseArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                House.houses);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_category);
        ListView houseListView = findViewById(R.id.house_list_view);
        houseListView.setAdapter(houseArrayAdapter);
        AdapterView.OnItemClickListener houselistListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // TODO: 11/3/18 create HouseActivity so this works correctly
                Intent intent = new Intent(HouseCategoryActivity.this, HouseActivity.class);
                intent.putExtra(HouseActivity.DRINK_ID, i);
                startActivity(intent);
            }
        };
        houseListView.setOnItemClickListener(houselistListener);
    }
}
