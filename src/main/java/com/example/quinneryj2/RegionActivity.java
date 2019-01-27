package com.example.quinneryj2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class RegionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        Singleton.getInstance().create();
    }

    public void northeast(View v){
        ArrayList<Plant> filteredList = isNortheast(Singleton.getInstance().getArray());
        Singleton.getInstance().change(filteredList);
        startActivity(new Intent(RegionActivity.this, ListActivity.class));
    }

    public void midwest(View v){
        ArrayList<Plant> filteredList = isMidwest(Singleton.getInstance().getArray());
        Singleton.getInstance().change(filteredList);
        startActivity(new Intent(RegionActivity.this, ListActivity.class));
    }

    public void south(View v){
        ArrayList<Plant> filteredList = isSouth(Singleton.getInstance().getArray());
        Singleton.getInstance().change(filteredList);
        startActivity(new Intent(RegionActivity.this, ListActivity.class));
    }

    public void west(View v){
        ArrayList<Plant> filteredList = isWest(Singleton.getInstance().getArray());
        Singleton.getInstance().change(filteredList);
        startActivity(new Intent(RegionActivity.this, ListActivity.class));
    }

    //filters the main arraylist to only include plants from the northeast
    public static ArrayList<Plant> isNortheast(ArrayList<Plant> master) {
        ArrayList<Plant> northeast = new ArrayList<>();

        for (Plant plant : master) {
            if (plant.getNortheast()==true) {
                northeast.add(plant);
            }
        }
        return northeast;
    }

    //filters the main arraylist to only include plants from the south
    public static ArrayList<Plant> isSouth(ArrayList<Plant> master) {
        ArrayList<Plant> south = new ArrayList<>();

        for (Plant plant : master) {
            if (plant.getSouth()==true) {
                south.add(plant);
            }
        }
        return south;
    }

    //filters the main arraylist to only include plants from the midwest
    public static ArrayList<Plant> isMidwest(ArrayList<Plant> master) {
        ArrayList<Plant> midwest = new ArrayList<>();

        for (Plant plant : master) {
            if (plant.getMidwest()==true) {
                midwest.add(plant);
            }
        }
        return midwest;
    }

    //filters the main arraylist to only include plants from the west
    public static ArrayList<Plant> isWest(ArrayList<Plant> master) {
        ArrayList<Plant> west = new ArrayList<>();

        for (Plant plant : master) {
            if (plant.getWest()==true) {
                west.add(plant);
            }
        }
        return west;
    }
}
