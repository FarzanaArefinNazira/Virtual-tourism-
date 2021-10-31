package com.example.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class books extends AppCompatActivity {
    private Spinner  Qu,color,pay;
    private Button confirm;
    private EditText bkash,cbkash,dateo,name,phone;
    DatabaseReference databaseReference;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        databaseReference = FirebaseDatabase.getInstance().getReference("Order");
       dateo = (EditText) findViewById(R.id.dates);
       bkash = (EditText) findViewById(R.id.bkash);
        cbkash = (EditText) findViewById(R.id.cbkash);
        name = (EditText) findViewById(R.id.Name);
        phone = (EditText) findViewById(R.id.phone);
        confirm = findViewById(R.id.con);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();

            }
        });
        Qu = (Spinner) findViewById(R.id.Qu);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Quantity, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Qu.setAdapter(adapter);

       color = (Spinner) findViewById(R.id.color);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.Color, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       color.setAdapter(adapter1);
        pay = (Spinner) findViewById(R.id.pays);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.pay, android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        pay.setAdapter(adapter2);
    }
    public void i() {
        String Qus = Qu.getSelectedItem().toString();
        String colors = color.getSelectedItem().toString();
        String pays = pay.getSelectedItem().toString();
        String bkashs = bkash.getText().toString().trim();
        String cbkashs = cbkash.getText().toString().trim();
        String dates = dateo.getText().toString().trim();
        String names=name.getText().toString().trim();
        String  phones=phone.getText().toString().trim();



        String key = databaseReference.push().getKey();
       sb bag= new sb(Qus,colors,bkashs, cbkashs, dates,names,phones,pays);
        databaseReference.child(key).setValue(bag);
        Toast.makeText(getApplicationContext(), "We will send you confirmation msg", Toast.LENGTH_LONG).show();
    }

}
