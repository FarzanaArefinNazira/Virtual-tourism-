package com.example.tourismapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.ref.Reference;
import java.lang.reflect.Member;
import java.util.Calendar;
import java.util.Deque;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private EditText memail,mname,mdateofbirth,mphonenumber,mpassword,mconfirmpasssword,city,address;
    private TextView msignuptext,mallready;
    private ImageView mcal;
    private Button mregister;
    //  private RadioGroup mradioGroup;
    //  private RadioButton mmale,mfemale;
    private ProgressBar mprogressBar;
    DatePickerDialog.OnDateSetListener listener;
    private int mdate,mmonth,myear;



    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mAuth = FirebaseAuth.getInstance();
        msignuptext =(TextView)findViewById(R.id.textView);
        msignuptext.setOnClickListener(this);
        memail = (EditText) findViewById(R.id.editTextTextPersonName2);

        mname = (EditText) findViewById(R.id.editTextTextPersonName3);

        mdateofbirth = (EditText) findViewById(R.id.editTextTextPersonName4);

        mphonenumber = (EditText)findViewById(R.id.editTextTextPersonName);

        mpassword = (EditText) findViewById(R.id.editTextTextPassword);

        mconfirmpasssword = (EditText)findViewById(R.id.editTextTextPassword2) ;
         city= (EditText) findViewById(R.id.City);

        address = (EditText)findViewById(R.id.Address) ;

        mcal = (ImageView)findViewById(R.id.imageView2);
        mcal.setOnClickListener(this);
        mallready = (TextView) findViewById(R.id.textView3);
        mallready.setOnClickListener(this);

        mregister =(Button)findViewById(R.id.button);
        mregister.setOnClickListener(this);
        mprogressBar = (ProgressBar)findViewById(R.id.progressBar);


        // user = new User();
        //  mradioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        //  mmale = (RadioButton) findViewById(R.id.radioButton3);
        // mfemale = (RadioButton) findViewById(R.id.radioButton5);



    /*    reference = database.getReference().child("User");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot snapshot) {



            }

            @Override
            public void onCancelled(@NonNull  DatabaseError error) {

            }
        });

        mregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = mmale.getText().toString();
                String f1 = mfemale.getText().toString();

                user.setName(name.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(user);

                if(mmale.isChecked()){
                    user.setGender(m1);
                    reference.child(String.valueOf(i+1)).setValue(user);
                }else {
                    user.setGender(f1);
                    reference.child(String.valueOf(i+1)).setValue(user);

                }

            }
        });*/


        mcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal = Calendar.getInstance();
                mdate = cal.get(Calendar.DATE);
                mmonth = cal.get(Calendar.MONTH);
                myear = cal.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(Register.this, android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        mdateofbirth.setText(dayOfMonth+"-"+month+"-"+year);
                    }
                }, myear,mmonth,mdate);
                datePickerDialog.show();
            }
        });







    }

    @Override
    public void onClick(View v) {



        switch (v.getId()){
            case R.id.textView:
                startActivity(new Intent(this,Register.class));
                break;
            case R.id.button:
                mregister();
                break;
            case R.id.textView3:
                startActivity(new Intent(this,Login.class));
                break;



        }



    }



   /* public void onRadioButtonClicked(View view) {

        int selectid = mradioGroup.getCheckedRadioButtonId();


        boolean checked = ((RadioButton) view).isChecked();



        switch(view.getId()) {
            case R.id.radioButton3:
                if (checked)
                    break;
            case R.id.radioButton5:
                if (checked)

                    break;
        }


    }*/

    private void mregister() {
        String email = memail.getText().toString().trim();
        String name = mname.getText().toString().trim();
        String phonenumber = mphonenumber.getText().toString().trim();
        String dateofbirth = mdateofbirth.getText().toString().trim();
        String fpassword = mpassword.getText().toString().trim();
        String fconfrimpassword = mconfirmpasssword.getText().toString().trim();
        String citys = city.getText().toString().trim();
        String addresss = address.getText().toString().trim();





        if(email.isEmpty()){
            memail.setError("Email is required!");
            memail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            memail.setError("Enter a valid email address");
            memail.requestFocus();
            return;
        }

        if(name.isEmpty()){
            mname.setError("User name is required!");
            mname.requestFocus();
            return;
        }
        if(phonenumber.isEmpty()){
            mphonenumber.setError("Phone number id required!");
            mphonenumber.requestFocus();
            return;
        }
        if(citys.isEmpty()){
            mname.setError("City is required!");
            mname.requestFocus();
            return;
        }
        if(addresss.isEmpty()){
            mphonenumber.setError("address id required!");
            mphonenumber.requestFocus();
            return;
        }
        if(fpassword.isEmpty()){
            mpassword.setError("password is required!");
            mpassword.requestFocus();
            return;
        }
        if(fpassword.length()<6){
            mpassword.setError("password must be 6 charaters!");
            mpassword.requestFocus();
            return;
        }
        if(! fpassword.equals(fconfrimpassword)){
            mconfirmpasssword.setError("password not mch!");
            mconfirmpasssword.requestFocus();
            return;
        }
        mprogressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email, fpassword)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull  Task<AuthResult> task) {

                        if(task.isSuccessful()){

                            reg user = new reg(email,name,dateofbirth,phonenumber,citys,addresss);

                            FirebaseDatabase.getInstance().getReference("users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull  Task<Void> task) {
                                    if(task.isSuccessful()){
                                        Toast.makeText(Register.this,"User has been registered successfully!",Toast.LENGTH_LONG).show();
                                        mprogressBar.setVisibility(View.VISIBLE);
                                        startActivity(new Intent(Register.this,Lo.class));
                                    }else {
                                        Toast.makeText(Register.this,"Failed to register! Try Again!",Toast.LENGTH_LONG).show();
                                        mprogressBar.setVisibility(View.VISIBLE);

                                    }

                                }
                            });

                        }else {
                            Toast.makeText(Register.this,"Failed to register! Try Again!",Toast.LENGTH_LONG).show();
                            mprogressBar.setVisibility(View.VISIBLE);

                        }

                    }
                });
    }
}