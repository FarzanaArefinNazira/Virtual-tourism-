package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Placedescription extends AppCompatActivity {
    private Button button32,button9,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placedescription);
        button32 = (Button) findViewById(R.id.button32);
        button9 = (Button) findViewById(R.id.button9);
        button6 = (Button) findViewById(R.id.button6);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p();
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k();
            }
        });





    }
    public void i(){
        Intent i = new Intent (this, placew.class);
        startActivity(i);
    }
    public void p(){
        Intent i = new Intent (this, Placedescription.class);
        startActivity(i);
    }
    public void k(){
        Intent i = new Intent (this, place.class);
        startActivity(i);
    }
}