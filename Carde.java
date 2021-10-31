package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Carde extends AppCompatActivity {
    private Button button49,button54;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carde);
        button49 = (Button) findViewById(R.id.button49);
        button54 = (Button) findViewById(R.id.button54);

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m();
            }
        });
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r();
            }
        });

    }
    public void m(){
        Intent i = new Intent (this,nwer.class);
        startActivity(i);
    }
    public void r(){
        Intent i = new Intent (this,car.class);
        startActivity(i);
    }
}