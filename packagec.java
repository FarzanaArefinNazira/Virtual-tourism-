package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class packagec extends AppCompatActivity {
    private Button button16,button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packagec);
        button16 = (Button) findViewById(R.id.button16);
        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n();
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m();
            }
        });

    }
    public void m(){
        Intent i = new Intent (this, hotelr.class);
        startActivity(i);
    }
    public void n(){
        Intent i = new Intent (this,Hotel.class);
        startActivity(i);
    }
}
