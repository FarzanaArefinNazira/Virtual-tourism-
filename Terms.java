package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terms extends AppCompatActivity {
    private Button button53,button52;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
        button53 = (Button) findViewById(R.id.button52);
        button52 = (Button) findViewById(R.id.button53);

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u();
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m();
            }
        });

    }
    public void u(){
        Intent i = new Intent (this, nwer.class);
        startActivity(i);
    }
    public void m(){
        Intent i = new Intent (this, car.class);
        startActivity(i);
    }

}