package com.example.tourismapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class finalor extends AppCompatActivity {
    private FirebaseUser Order;
    private DatabaseReference reference;
    private String ID;
    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalor);
       logout = (Button) findViewById(R.id.cancel);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference.child("Order").child("ID").setValue(null);
            }
        });

        Order = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Order");
        ID = Order.getDisplayName();

        final TextView nameTextView = (TextView) findViewById(R.id.name);
        final TextView colorTextView = (TextView) findViewById(R.id.color);
        final TextView QuTextView = (TextView) findViewById(R.id.Qu);
        final TextView phoneTextView = (TextView) findViewById(R.id.phone);

        reference.child(ID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                sb Order = snapshot.getValue(sb.class);

                if ( Order!= null) {
                    String name = Order.name;
                    String color = Order.color;

                    String Qu = Order.Qu;
                    String phone = Order.phone;

                    nameTextView.setText(name);
                    colorTextView.setText(color);
                    QuTextView.setText(Qu);
                    phoneTextView.setText(phone);



                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(finalor.this,"Something Wrong happend", Toast.LENGTH_LONG).show();


            }
        });



    }
}