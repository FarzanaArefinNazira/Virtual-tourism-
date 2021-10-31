package com.example.tourismapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ordershow extends AppCompatActivity {
    private FirebaseUser Order;
    private DatabaseReference reference;
    private String userID;

    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordershow);
        Order = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("users");
        userID = Order.getUid();

        final TextView nameTextView = (TextView) findViewById(R.id.name);
        final TextView phoneTextView = (TextView) findViewById(R.id.phone);
        final TextView bkashTextView = (TextView) findViewById(R.id.bkash);
        final TextView cbkashTextView = (TextView) findViewById(R.id.cbkash);
        final TextView payTextView = (TextView) findViewById(R.id.pay);
        final TextView dateTextView = (TextView) findViewById(R.id.date);
        final TextView colorTextView = (TextView) findViewById(R.id.color);
        final TextView QuTextView = (TextView) findViewById(R.id.Qu);



    }
}