package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Go extends AppCompatActivity {
    private Button button23, button17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
        button17 = (Button) findViewById(R.id.button17);
        button23 = (Button) findViewById(R.id.button23);


        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f();
            }


        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t();
            }
        });
    }


        public void f() {
            Intent intent = new Intent(this, find.class);
            startActivity(intent);


        }



        public void t(){
            Intent i = new Intent (this, MainActivity.class);
            startActivity(i);
        }
    }



