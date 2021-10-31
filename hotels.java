package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hotels extends AppCompatActivity {
    private Button button5,button40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        button5 = (Button) findViewById(R.id.button5);
        button40 = (Button) findViewById(R.id.button40);
        //button28 = (Button) findViewById(R.id.button28);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p();
            }


        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r();
            }


        });




    }
    public void r() {
        Intent intent = new Intent (this, find.class);
        startActivity(intent);


    }

    public void p() {
        Intent intent = new Intent (this, hotelr.class);
        startActivity(intent);


    }
}