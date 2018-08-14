package com.example.dell_pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Mainsignup extends AppCompatActivity {
     RadioGroup radiobutton,radiobutton2;
     EditText  firstname,lastname,email,contact;
     Button submit;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsignup);

        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        email = (EditText) findViewById(R.id.e_mailid);
        contact = (EditText) findViewById(R.id.phonenoid);
        radiobutton = (RadioGroup) findViewById(R.id.radioid);
        radiobutton2 = (RadioGroup) findViewById(R.id.radioid2);
        submit = (Button) findViewById(R.id.submitid);
        firebaseAuth = FirebaseAuth.getInstance();



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Mainqrscan.class));
            }
        });

    }
}
