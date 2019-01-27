package com.example.quinneryj2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GettingStartedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_started);
    }

    public void usageWarning(View v){
        startActivity(new Intent(GettingStartedActivity.this, UsageWarningActivity.class));
    }

    public void howTo(View v){
        startActivity(new Intent(GettingStartedActivity.this, HowToActivity.class));
    }
}
