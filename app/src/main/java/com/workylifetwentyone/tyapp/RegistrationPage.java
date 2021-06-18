package com.workylifetwentyone.tyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationPage extends AppCompatActivity {
    EditText mname,memail,mpassword;
    Button loginbtn;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        mname=findViewById(R.id.name);
        memail=findViewById(R.id.Email);
        mpassword=findViewById(R.id.Password);
        loginbtn=findViewById(R.id.btnLogin);

        firebaseAuth=FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.progressBar);



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=memail.getText().toString().trim();
                String password=mpassword.getText().toString().trim();


                if(TextUtils.isEmpty(email)){
                    memail.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    mpassword.setError("Password is Required");
                    return;
                }

                if(password.length()<6){
                    mpassword.setError("Password Must be >=6 Chracters");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);
                firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                      if(task.isSuccessful()){
                          Toast.makeText(RegistrationPage.this,"User Registered",Toast.LENGTH_SHORT).show();
                          startActivity(new Intent(getApplicationContext(),MainActivity3.class));
                      }
                      else{
                          Toast.makeText(RegistrationPage.this,"Error"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                      }
                    }
                });
            }
        });

    }


    public void back(View view) {
        Intent intent=new Intent(RegistrationPage.this,MainActivity3.class);
        startActivity(intent);
        finish();
    }
}