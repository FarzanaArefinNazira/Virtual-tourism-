package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class find extends AppCompatActivity {
    private Button button12,button10,button11,button13,button19,Profile,Map,order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        button12 = (Button) findViewById(R.id.button12);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button13 = (Button) findViewById(R.id.button13);
        button19 = (Button) findViewById(R.id.button19);
        Map= (Button) findViewById(R.id.Map);
        Profile=(Button) findViewById(R.id.Profile);
        order=(Button) findViewById(R.id.order);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m();
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r();
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y();
            }
        });
       Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                W();
            }
        });

        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p();
            }
        });
      order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e();
            }
        });
    }
    public void m(){
        Intent i = new Intent (this, hotels.class);
        startActivity(i);
    }
    public void r(){
        Intent i = new Intent (this, Go.class);
        startActivity(i);
    }
    public void i(){
        Intent i = new Intent (this, Placedescription.class);
        startActivity(i);
    }
    public void l(){
        Intent i = new Intent (this, car.class);
        startActivity(i);
    }
    public void y(){
        Intent i = new Intent (this, shop.class);
        startActivity(i);
    }
    public void W(){
        Intent i = new Intent (this, Userprofile.class);
        startActivity(i);
    }
    public void p(){
        Intent i = new Intent (this, Finalmap.class);
        startActivity(i);
    }
    public void e(){
        Intent i = new Intent (this, finalor.class);
        startActivity(i);
    }


}