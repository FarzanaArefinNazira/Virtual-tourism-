package com.example.tourismapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class bca extends AppCompatActivity {
    private EditText memail, mname, mdateofbirth, mphonenumber, mpassword, mconfirmpasssword;
    private TextView msignuptext, mallready;
    private ImageView mcal;
    private Button mregister;
    //  private RadioGroup mradioGroup;
    //  private RadioButton mmale,mfemale;
    private ProgressBar mprogressBar;
    DatePickerDialog.OnDateSetListener listener;
    private int mdate, mmonth, myear;


    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca);

        mAuth = FirebaseAuth.getInstance();
        msignuptext = (TextView) findViewById(R.id.textView);

        memail = (EditText) findViewById(R.id.editTextTextPersonName2);

        mname = (EditText) findViewById(R.id.editTextTextPersonName3);

        mdateofbirth = (EditText) findViewById(R.id.editTextTextPersonName4);

        mphonenumber = (EditText) findViewById(R.id.editTextTextPersonName);

        mpassword = (EditText) findViewById(R.id.editTextTextPassword);

        mconfirmpasssword = (EditText) findViewById(R.id.editTextTextPassword2);

        mcal = (ImageView) findViewById(R.id.imageView2);

        mallready = (TextView) findViewById(R.id.textView3);
        mcal.setOnClickListener((View.OnClickListener) this);
        mregister = (Button) findViewById(R.id.button);
        mregister.setOnClickListener((View.OnClickListener) this);

        mprogressBar = (ProgressBar) findViewById(R.id.progressBar);





        mcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal = Calendar.getInstance();
                mdate = cal.get(Calendar.DATE);
                mmonth = cal.get(Calendar.MONTH);
                myear = cal.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(bca.this, android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        mdateofbirth.setText(dayOfMonth + "-" + month + "-" + year);
                    }
                }, myear, mmonth, mdate);
                datePickerDialog.show();
            }
        });


    }


    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.textView:
                startActivity(new Intent(this, bookcar.class));
                break;
            case R.id.button:
                mregister();
                break;
            case R.id.textView3:
                startActivity(new Intent(this, Carde.class));
                break;


        }


    }





    private void mregister() {
        String email = memail.getText().toString().trim();
        String name = mname.getText().toString().trim();
        String phonenumber = mphonenumber.getText().toString().trim();
        String dateofbirth = mdateofbirth.getText().toString().trim();
        String fpassword = mpassword.getText().toString().trim();
        String fconfrimpassword = mconfirmpasssword.getText().toString().trim();


        if (email.isEmpty()) {
            memail.setError("Email is required!");
            memail.requestFocus();
            return;
        }


        if (name.isEmpty()) {
            mname.setError("User name is required!");
            mname.requestFocus();
            return;
        }
        if (phonenumber.isEmpty()) {
            mphonenumber.setError("Phone number id required!");
            mphonenumber.requestFocus();
            return;
        }
        if (fpassword.isEmpty()) {
            mpassword.setError("password is required!");
            mpassword.requestFocus();
            return;
        }
        if (fpassword.length() < 6) {
            mpassword.setError("password must be 6 charaters!");
            mpassword.requestFocus();
            return;
        }
        if (!fpassword.equals(fconfrimpassword)) {
            mconfirmpasssword.setError("password not mch!");
            mconfirmpasssword.requestFocus();
            return;
        }
        mprogressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email, fpassword)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            bkc BMW = new bkc(email, name, dateofbirth, phonenumber);

                            FirebaseDatabase.getInstance().getReference("BMW")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(BMW).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(bca.this, "User has been registered successfully!", Toast.LENGTH_LONG).show();
                                        mprogressBar.setVisibility(View.VISIBLE);
                                        startActivity(new Intent(bca.this, Lo.class));
                                    } else {
                                        Toast.makeText(bca.this, "Failed to register! Try Again!", Toast.LENGTH_LONG).show();
                                        mprogressBar.setVisibility(View.VISIBLE);

                                    }

                                }
                            });

                        } else {
                            Toast.makeText(bca.this, "Failed to register! Try Again!", Toast.LENGTH_LONG).show();
                            mprogressBar.setVisibility(View.VISIBLE);

                        }

                    }
                });
    }

}


