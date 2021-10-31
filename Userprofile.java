package com.example.tourismapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

public class Userprofile extends AppCompatActivity {
    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;
    private Button logout;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        logout = findViewById(R.id.signout);
        add= findViewById(R.id.Address);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(Userprofile.this, MainActivity.class));
            }
        });
   add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Userprofile.this, Address.class));
            }
        });
        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("users");
        userID = user.getUid();

        final TextView nameTextView = (TextView) findViewById(R.id.name);

        final TextView emailTextView =(TextView) findViewById(R.id.email);

        final TextView phonenumberTextview = (TextView) findViewById(R.id.phonenumber);

        final TextView dateofbrithTextView = (TextView)findViewById(R.id.dateofbrith);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                reg userprofile = snapshot.getValue(reg.class);

                if (userprofile != null) {
                    String name = userprofile.name;
                    String email = userprofile.email;

                    String dateofbirth = userprofile.dateofbirth;
                    String phonenumber = userprofile.phonenumber;

                    nameTextView.setText(name);
                    emailTextView.setText(email);
                    dateofbrithTextView.setText(dateofbirth);
                    phonenumberTextview.setText(phonenumber);



                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Userprofile.this,"Something Wrong happend", Toast.LENGTH_LONG).show();


            }
        });


    }
}
