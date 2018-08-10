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

public class Mainsignupnext extends AppCompatActivity {

    EditText  Phoneno,Email;
    Button nextbutton;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsignupnext);

        Phoneno = (EditText) findViewById(R.id.Phoneid);
        Email = (EditText) findViewById(R.id.Emailid);
        nextbutton = (Button) findViewById(R.id.Nextid);
        firebaseAuth = FirebaseAuth.getInstance();



        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Phoneno.length()<6){
                    Toast.makeText(getApplicationContext(),"Password must be at least 6 characters",Toast.LENGTH_SHORT).show();
                }

                startActivity(new Intent(getApplicationContext(),Mainqrscan.class));
            }
        });


    }
}
