package com.example.dell_pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class Mainforgetpw2 extends AppCompatActivity {

    Button submit;
    EditText newpass,conformpass;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainforgetpw2);

        newpass = (EditText) findViewById(R.id.newpass);
        conformpass = (EditText) findViewById(R.id.conformpass);
        submit = (Button) findViewById(R.id.passsubmitid);
        firebaseAuth = FirebaseAuth.getInstance();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Studentpage.class));
            }
        });

    }
}
