package com.example.quinneryj2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;

public class PlantItselfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_itself);

        Intent intent = getIntent();
        int plantIndex = intent.getIntExtra("buttonID", 0);
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(Singleton.getInstance().getArray().get(plantIndex).getName());


        ImageView image = (ImageView) findViewById(R.id.image);


        String plantName = Singleton.getInstance().getArray().get(plantIndex).getImage();
        Context context = image.getContext();
        int id = context.getResources().getIdentifier(plantName, "drawable", context.getPackageName());
        image.setImageResource(id);


        TextView destroy = (TextView) findViewById(R.id.description);
        destroy.setText(Singleton.getInstance().getArray().get(plantIndex).getDestroyer());
    }
}