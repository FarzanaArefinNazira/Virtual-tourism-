package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
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

public class Hotel extends AppCompatActivity {
    private Spinner hotel, room, adult, child, roomneed,pay;
    private EditText checkindatwe, checkoutdate, bkash, cbkash,name,phonenumber;
    private Button book;

    DatePickerDialog.OnDateSetListener listener;
    private int mdate, mmonth, myear;
    private ImageView mcal,m;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        databaseReference = FirebaseDatabase.getInstance().getReference("HotelBook");
        checkindatwe = (EditText) findViewById(R.id.checkindate);
        checkoutdate = (EditText) findViewById(R.id.checkoutdate);
        bkash = (EditText) findViewById(R.id.bkash);
        cbkash = (EditText) findViewById(R.id.cbkash);
         name = (EditText) findViewById(R.id.Name);
        phonenumber = (EditText) findViewById(R.id.phone);
        book = findViewById(R.id.book);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();
            }
        });

        hotel = (Spinner) findViewById(R.id.hotel);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        hotel.setAdapter(adapter);

        room = (Spinner) findViewById(R.id.room);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.planetsarray, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        room.setAdapter(adapter1);
        adult = (Spinner) findViewById(R.id.adult);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Adult, android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adult.setAdapter(adapter2);

        child = (Spinner) findViewById(R.id.chlid);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.child, android.R.layout.simple_spinner_item);

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        child.setAdapter(adapter3);
        roomneed = (Spinner) findViewById(R.id.roomneed);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.Room_No, android.R.layout.simple_spinner_item);

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        roomneed.setAdapter(adapter4);
        pay = (Spinner) findViewById(R.id.payo);

        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.pay, android.R.layout.simple_spinner_item);

        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        pay.setAdapter(adapter5);

    }


    public void i() {
        String hotels = hotel.getSelectedItem().toString();
        String rooms = room.getSelectedItem().toString();
        String adults = adult.getSelectedItem().toString();
        String childs = child.getSelectedItem().toString();
        String payo = pay.getSelectedItem().toString();
        String roomnos = roomneed.getSelectedItem().toString();
        String bkashs = bkash.getText().toString().trim();
        String cbkashs = cbkash.getText().toString().trim();
        String checkin = checkindatwe.getText().toString().trim();
        String checkout = checkoutdate.getText().toString().trim();
        String names = name.getText().toString().trim();
        String phones = phonenumber.getText().toString().trim();




        String key = databaseReference.push().getKey();
        hotelbook hotelbooks = new hotelbook(hotels, rooms, adults, childs, roomnos, bkashs, cbkashs, checkin, checkout,payo,names,phones);
        databaseReference.child(key).setValue(hotelbooks);
        Toast.makeText(getApplicationContext(), "We will send you confirmation msg", Toast.LENGTH_LONG).show();
    }
}