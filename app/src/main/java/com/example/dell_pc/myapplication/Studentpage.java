package com.example.dell_pc.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
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



public class Studentpage extends AppCompatActivity {
    ImageButton assignmentImage,attendenceImage,noteImage,marksImage,profileImage,notificationImage,settingImage;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentpage);

        ImageButton assignmentImage = (ImageButton) findViewById(R.id.assignmentid);
        ImageButton profileImage=(ImageButton) findViewById(R.id.profile);
        ImageButton notificationImage=(ImageButton) findViewById(R.id.notification);
        ImageButton settingImage=(ImageButton) findViewById(R.id.setting);
        ImageButton attendenceImage =(ImageButton) findViewById(R.id.attendenceid);
        ImageButton noteImage =(ImageButton) findViewById(R.id.noteid);
        ImageButton marksImage =(ImageButton) findViewById(R.id.marksid);
        firebaseAuth=FirebaseAuth.getInstance();


        profileImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Studprofile.class));
            }

        });

        notificationImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Studnotification.class));
            }
        });

        settingImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Studsetting.class));

            }
        });


        assignmentImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Studassignment.class));
            }

        });

        attendenceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Studentpage.class));

            }
        });

        noteImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Studentpage.class));

            }
        });

        marksImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Studentpage.class));

            }
        });

    }
}
