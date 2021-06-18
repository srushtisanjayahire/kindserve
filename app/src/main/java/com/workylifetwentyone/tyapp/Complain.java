package com.workylifetwentyone.tyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Complain extends AppCompatActivity {
    EditText editText;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        editText=findViewById(R.id.complainbox);
        btn=findViewById(R.id.btnsubmit);
    }

    public void backtohome(View view) {
        Toast.makeText(Complain.this,"Thank you for feedback",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(Complain.this,MainActivity3.class);
        startActivity(intent);
        finish();
    }
}