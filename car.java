package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class car extends AppCompatActivity {
    private Button button42,button45,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        button42 = (Button) findViewById(R.id.button42);
        button45 = (Button) findViewById(R.id.button45);
        button4 = (Button) findViewById(R.id.button4);


        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l();
            }
        });



    }
    public void m(){
        Intent i = new Intent (this, find.class);
        startActivity(i);
    }

    public void i(){
        Intent i = new Intent (this, carr.class);
        startActivity(i);
    }
    public void l(){
        Intent i = new Intent (this, Carde.class);
        startActivity(i);
    }
    }
