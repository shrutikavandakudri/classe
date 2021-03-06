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
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import android.util.Log;
import android.widget.ProgressBar;


public class Mainlogin extends AppCompatActivity {

    EditText email,password;
    Button loginButton,signupButton,Forgetpassbtn;
    FirebaseAuth firebaseAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin);

         email = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.Password);
        loginButton = (Button) findViewById(R.id.Login);
        signupButton = (Button) findViewById(R.id.Signup);
        Forgetpassbtn = (Button) findViewById(R.id.Forgetpassid);
        progressBar = (ProgressBar) findViewById(R.id.progressid);
        firebaseAuth = FirebaseAuth.getInstance();

        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Email = email.getText().toString().trim();
                String Password = password.getText().toString().trim();

                if(TextUtils.isEmpty(Email) || TextUtils.isEmpty(Password)){
                    Toast.makeText(getApplicationContext(),"Please fill in the required fields",Toast
                            .LENGTH_SHORT).show();
                    return;
                }

                if(Password.length()<6){
                    Toast.makeText(getApplicationContext(),"Password must be at least 6 characters",Toast
                            .LENGTH_SHORT).show();
                }

                loginButton.setEnabled(false);
                progressBar.setVisibility(View.VISIBLE);


                firebaseAuth.signInWithEmailAndPassword(Email,Password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    progressBar.setVisibility(View.GONE);
                                    startActivity(new Intent(getApplicationContext(),Studentpage.class));
                                    finish();
                                }
                                else{
                                    progressBar.setVisibility(View.GONE);
                                    loginButton.setEnabled(true);
                                    Toast.makeText(getApplicationContext(),"E-mail or password is wrong",Toast
                                            .LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Mainsignup.class));
            }
        });

        Forgetpassbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Mainforgetpw.class));
            }
        });

        if(firebaseAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(),Mainlogin.class));
            }
    }
}



