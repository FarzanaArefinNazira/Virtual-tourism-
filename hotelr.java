package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hotelr extends AppCompatActivity {
    private Button button14,button26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotelr);

        button14 = (Button) findViewById(R.id.button14);
        button26 = (Button) findViewById(R.id.button26);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p();
            }


        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m();
            }


        });

    }
    public void p() {
        Intent intent = new Intent (this, packagec.class);
        startActivity(intent);


    }
    public void m() {
        Intent intent = new Intent (this, hotels.class);
        startActivity(intent);


    }
}