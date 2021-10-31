package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class carr extends AppCompatActivity {
    private Button button55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carr);
        button55 = (Button) findViewById(R.id.button55);
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();
            }
        });

    }
    public void i(){
        Intent i = new Intent (this, car.class);
        startActivity(i);
    }
}