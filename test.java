package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class test extends AppCompatActivity {
    private Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        book= (Button) findViewById(R.id.book);
     book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n();
            }
        });


    }
    public void n(){
        Intent i = new Intent (this, Hotel.class);
        startActivity(i);
    }
}