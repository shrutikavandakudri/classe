package com.example.dell_pc.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.ImageButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Studprofile extends AppCompatActivity {

    Button Savebutton;
    EditText Class,Skills,Education,Projects;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studprofile);

        Class = (EditText) findViewById(R.id.classid);
        Skills = (EditText) findViewById(R.id.skillsid);
        Education = (EditText) findViewById(R.id.educationid);
        Projects = (EditText)  findViewById(R.id.projectid);
        Savebutton = (Button) findViewById(R.id.saveid);
        firebaseAuth = FirebaseAuth.getInstance();


        Savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Studentpage.class));
            }
        });

    }
}
