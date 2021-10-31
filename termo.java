package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class termo extends AppCompatActivity {
    private Button button57;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termo);


        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();
            }
        });

    }
    public void i(){
        Intent i = new Intent (this, hotelb.class);
        startActivity(i);
    }
}