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


public class Mainforgetpw extends AppCompatActivity {

    Button resendcode,nextbtn;
    EditText entercode;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainforgetpw);

        entercode = (EditText) findViewById(R.id.entercodeid);
         resendcode= (Button) findViewById(R.id.resendcodeid);
         nextbtn = (Button) findViewById(R.id.nextbtnid);
        firebaseAuth = FirebaseAuth.getInstance();


        resendcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Mainforgetpw.class));
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Mainforgetpw2.class));
            }
        });
    }
}
