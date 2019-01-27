package com.example.quinneryj2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView mTextView = (TextView) findViewById(R.id.my_text);

        //Plant myPlant = new Plant("image\path", "dumb plant");

        //mTextView.setText("wow");
    }

    public void letsGo(View v){
        startActivity(new Intent(MainActivity.this, RegionActivity.class));
    }

    public void about(View v){
        startActivity(new Intent(MainActivity.this, AboutActivity.class));
    }

    public void gettingStarted(View v){
        startActivity(new Intent(MainActivity.this, GettingStartedActivity.class));
    }

}
