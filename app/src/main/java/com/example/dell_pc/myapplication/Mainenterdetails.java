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


public class Mainenterdetails extends AppCompatActivity {

    String [] SPINNERLIST1={"INDIA","AUSTRALIA","BELGIUM","SOUTH AFRICA","NEPAL"};
    String [] SPINNERLIST2={"ANDHRA PRADESH","BIHAR","GUJARAT","HARYANA","JHARKHAND","KARNATAKA","MADHYA PRADESH"};
    String [] SPINNERLIST3={"BAGALKOT","BELAGAVI","BENGALURU URBAN","CHIKKABALLAPUR","DAKSHINA KANNADA","UTTARA KANNADA"};


    EditText  Area,Landmark,Pincode;
    Button submitbutton1;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainenterdetails);


        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,SPINNERLIST1);
        MaterialBetterSpinner betterSpinner1=(MaterialBetterSpinner) findViewById(R.id.spinnerid1);
        betterSpinner1.setAdapter(arrayAdapter1);

        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,SPINNERLIST2);
        MaterialBetterSpinner betterSpinner2=(MaterialBetterSpinner) findViewById(R.id.spinnerid2);
        betterSpinner2.setAdapter(arrayAdapter2);


        ArrayAdapter<String> arrayAdapter3=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,SPINNERLIST3);
        MaterialBetterSpinner betterSpinner3=(MaterialBetterSpinner) findViewById(R.id.spinnerid3);
        betterSpinner3.setAdapter(arrayAdapter3);

        Area = (EditText) findViewById(R.id.areaid);
        Landmark = (EditText) findViewById(R.id.landmarkid);
        Pincode = (EditText) findViewById(R.id.pinid);
        submitbutton1 = (Button) findViewById(R.id.submitid);
        firebaseAuth = FirebaseAuth.getInstance();


        submitbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Mainqrscan.class));
            }
        });
        }
}
