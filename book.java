package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class book extends AppCompatActivity {
    private Spinner car, days, location, cartype, carneed;
    private EditText checkindatwe, checkoutdate, bkash, cbkash;
    private Button book;
    DatePickerDialog.OnDateSetListener listener;

    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        databaseReference = FirebaseDatabase.getInstance().getReference();
        checkindatwe = (EditText) findViewById(R.id.checkindate);
        checkoutdate = (EditText) findViewById(R.id.checkoutdate);
        bkash = (EditText) findViewById(R.id.bkash);
        cbkash = (EditText) findViewById(R.id.cbkash);
        book = findViewById(R.id.book);


        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();

            }
        });

        car = (Spinner) findViewById(R.id.car);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.car, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        car.setAdapter(adapter);

        days = (Spinner) findViewById(R.id.Days);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.Room_No, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        days.setAdapter(adapter1);
        location = (Spinner) findViewById(R.id.location);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.locations, android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        location.setAdapter(adapter2);

        cartype = (Spinner) findViewById(R.id.cartype);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.car_type, android.R.layout.simple_spinner_item);

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        cartype.setAdapter(adapter3);
        carneed = (Spinner) findViewById(R.id.carneed);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.car_need, android.R.layout.simple_spinner_item);

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        carneed.setAdapter(adapter4);


    }
    public void m(){
        Intent i = new Intent (this, coxsimage.class);
        startActivity(i);
    }

    public void i() {
        String cards = car.getSelectedItem().toString();
        String dayso = days.getSelectedItem().toString();
        String locations = location.getSelectedItem().toString();
        String cartypes = cartype.getSelectedItem().toString();
        String carneeds = carneed.getSelectedItem().toString();
        String bkashs = bkash.getText().toString().trim();
        String cbkashs = cbkash.getText().toString().trim();
        String checkin = checkindatwe.getText().toString().trim();
        String checkout = checkoutdate.getText().toString().trim();

        String key = databaseReference.push().getKey();

        Toast.makeText(getApplicationContext(), "We will send you confirmation msg", Toast.LENGTH_LONG).show();
    }
}