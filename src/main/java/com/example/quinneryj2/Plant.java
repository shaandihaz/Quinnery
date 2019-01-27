package com.example.quinneryj2;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;

public class Plant extends AppCompatActivity {

    public String name;
    public boolean northeast;
    public boolean south;
    public boolean midwest;
    public boolean west;
    public String category;
    public String destroyer;
    public String image;

    // all the getters for the plants
    public String getName() {
        return name;
    }

    public boolean getNortheast() {
        return northeast;
    }

    public boolean getSouth() {
        return south;
    }

    public boolean getMidwest() {
        return midwest;
    }

    public boolean getWest() {
        return west;
    }

    public String getCategory() {
        return category;
    }

    public String getDestroyer() {
        return destroyer;
    }

    public String getImage() {
        return image;
    }


    // Plant, takes in a name, region, category, and image
    public Plant(String name, boolean northeast, boolean south, boolean midwest, boolean west, String category, String image, String destroyer) {
        this.name = name;
        this.northeast = northeast;
        this.south = south;
        this.midwest = midwest;
        this.west = west;
        this.category = category;
        this.image = image;
        this.destroyer = destroyer;
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
/*
    DONT FORGET VINE PLANT (DO IT FOR THE VINE)
    //filters the main arraylist to only include ground cover plants
    public static ArrayList<Plant> isGroundCover(ArrayList<Plant> master) {
        ArrayList<Plant> groundCover = new ArrayList<>();

        for (Plant plant : master) {
            if (plant.getCategory().equals("Ground Cover")) {
                groundCover.add(plant);
            }
        }
        return groundCover;
    }

    //filters the main arraylist to only include ABP plants
    public static ArrayList<Plant> isAbp(ArrayList<Plant> master) {
        ArrayList<Plant> abp = new ArrayList<>();

        for (Plant plant : master) {
            if (plant.getCategory().equals("abp")) {
                abp.add(plant);
            }
        }
        return abp;
    }
    //filters the main arraylist to only include bush plants
    public static ArrayList<Plant> isBush(ArrayList<Plant> master) {
        ArrayList<Plant> bush = new ArrayList<>();

        for (Plant plant : master) {
            if (plant.getCategory().equals("Bush")) {
                bush.add(plant);
            }
        }
        return bush;
    }
    //filters the main arraylist to only include trees
    public static ArrayList<Plant> isTree(ArrayList<Plant> master) {
        ArrayList<Plant> tree = new ArrayList<>();

        for (Plant plant : master) {
            if (plant.getCategory().equals("Tree")) {
                tree.add(plant);
            }
        }
        return tree;
    } */
}
