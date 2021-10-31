package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Address extends AppCompatActivity {
         private Button Save;
         private EditText City,Area,Address,AAddress;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        databaseReference = FirebaseDatabase.getInstance().getReference("Address");
        City = (EditText) findViewById(R.id.City);
        Area = (EditText) findViewById(R.id.Area);
        Address=(EditText) findViewById(R.id.Address);
        AAddress = (EditText) findViewById(R.id.AAddress);
        Save =  findViewById(R.id.Save);
       Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();



            }
        });


    }


    public void i() {


        String city = City.getText().toString().trim();
        String  area = Area.getText().toString().trim();
        String address = Address.getText().toString().trim();
        String anaddress = AAddress.getText().toString().trim();

        String key = databaseReference.push().getKey();
        Add Adds = new Add(city,area,address,anaddress);
        databaseReference.child(key).setValue("Adds");

        Toast.makeText(getApplicationContext(), "Address changed Successfully", Toast.LENGTH_LONG).show();
    }
}