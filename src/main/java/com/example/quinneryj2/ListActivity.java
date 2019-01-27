package com.example.quinneryj2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        int numberToDisplay = Singleton.getInstance().getArray().size();

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);

        Button[] buttons = new Button[numberToDisplay];
        Button thisButton;

        for (int i = 0; i < numberToDisplay; i++)
        {
            ImageView image = new ImageView(getApplicationContext());
            String plantName = Singleton.getInstance().getArray().get(i).getImage();
            Context context = image.getContext();
            int id = context.getResources().getIdentifier(plantName, "drawable", context.getPackageName());
            image.setImageResource(id);
            image.setAdjustViewBounds(true);
            linLayout.addView(image);


            thisButton = new Button(this);
            thisButton.setId(i);

            thisButton.setText(Singleton.getInstance().getArray().get(i).getName());

            // add the button to the linearLayout
            linLayout.addView(thisButton);

            buttons[i] = thisButton;

            ImageView image2 = new ImageView(getApplicationContext());
            image2.setImageResource(R.drawable.white);
            image2.setAdjustViewBounds(true);
            linLayout.addView(image2);

        }

        for ( int i = 0; i < numberToDisplay; i++){
            final Button button = findViewById(i);
            final int x = i;
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent myIntent = new Intent(ListActivity.this, PlantItselfActivity.class);
                    myIntent.putExtra("buttonID", x);
                    startActivity(myIntent);
                }
            });
        }

    }

    @Override
    public void onBackPressed() {
        ArrayList<Plant> emptyList = new ArrayList<>();
        Singleton.getInstance().change(emptyList);
        Singleton.getInstance().create();
        super.onBackPressed();
    }
}
