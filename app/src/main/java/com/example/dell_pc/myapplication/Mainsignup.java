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
     RadioGroup radiobutton;
     EditText  signupname,signuppass;
     Button nextstepbutton;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsignup);

        signupname = (EditText) findViewById(R.id.signupname);
        signuppass = (EditText) findViewById(R.id.signuppass);
        radiobutton = (RadioGroup) findViewById(R.id.radioid);
        nextstepbutton = (Button) findViewById(R.id.nextbutton);
        firebaseAuth = FirebaseAuth.getInstance();



        nextstepbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Mainsignupnext.class));
            }
        });

    }
}
