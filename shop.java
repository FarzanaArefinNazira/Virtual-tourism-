package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shop extends AppCompatActivity {
    private Button bags;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        bags = (Button) findViewById(R.id.bags);

        bags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();
            }
        });
    }
    public void i(){
        Intent i = new Intent (this, shopping .class);
        startActivity(i);
    }
}