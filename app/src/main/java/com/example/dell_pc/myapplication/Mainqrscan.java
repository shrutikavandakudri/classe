package com.example.dell_pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Mainqrscan extends AppCompatActivity {

    EditText  Address;
    Button qrbutton;
    CheckBox chechbox1;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainqrscan);


        Address = (EditText) findViewById(R.id.addressid);
        qrbutton = (Button) findViewById(R.id.Qrbuttonid);
        chechbox1 = (CheckBox) findViewById(R.id.copyaddress);
        firebaseAuth = FirebaseAuth.getInstance();


        qrbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Mainenterdetails.class));
            }
        });

    }

    public void  addListenerOnButton() {

        chechbox1 =(CheckBox) findViewById(R.id.copyaddress);
    }
}
