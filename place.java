package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class place extends AppCompatActivity {
     private Button button21,button22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);

        button21.setOnClickListener(new View.OnClickListener() {
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
}