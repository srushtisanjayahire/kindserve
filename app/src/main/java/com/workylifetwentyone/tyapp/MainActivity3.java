package com.workylifetwentyone.tyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity3 extends AppCompatActivity {
    RatingBar ratingBar;
    Button ratingbutton,instapage,websitepage,telegrampage,facebookpage;
    private static final int MY_PERMISSION_REQUEST__SEND_SMS=0;
    ImageButton carrent,painting,cleaning,beauty,renovation,medicalservice,massage,pestcontrol,
    grocerry,repairs,makeups,homedelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ratingBar=findViewById(R.id.ratingBar);
        ratingbutton=findViewById(R.id.ratingsubmit);
        instapage=findViewById(R.id.instapage);
        websitepage=findViewById(R.id.websitepage);
        telegrampage=findViewById(R.id.telegrampage);
        facebookpage=findViewById(R.id.facebookpage);

        carrent=findViewById(R.id.carrent);
        painting=findViewById(R.id.painter);
        cleaning=findViewById(R.id.cleaning);
        beauty=findViewById(R.id.beauty);
        renovation=findViewById(R.id.renovation);
        medicalservice=findViewById(R.id.medicalservice);
        massage=findViewById(R.id.massage);
        pestcontrol=findViewById(R.id.pestcontrol);
        grocerry=findViewById(R.id.grocerry);
        repairs=findViewById(R.id.repairs);
        makeups=findViewById(R.id.makeups);
        homedelivery=findViewById(R.id.homedelivery);




        //code to send sms
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS)){

            }
            else{
                //pop up
                ActivityCompat.requestPermissions(this,new String[ ]{Manifest.permission.SEND_SMS},MY_PERMISSION_REQUEST__SEND_SMS);
            }
        }
        //for rating bar submit onclick
        ratingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://play.google.com/store/apps/developer?id=workylife");
            }
        });
        //for insta page onclick
        instapage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/kindserve/");
            }
        });
        //for website page
        websitepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://qkqrpclfxs8q6robewygva-on.drv.tw/www.kindserve.com/index1.html");
            }
        });
        //for telegram page
        telegrampage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://t.me/joinchat/tHLrNYkcsRwzMzBl");
            }
        });
       //for facebook page
        facebookpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/profile.php?id=100067481384739&sk=grid");
            }
        });





















        //place order on button click
        carrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to car on rent";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });
        painting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to painting";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });
        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to cleaning";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want beauty";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });
        renovation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to do renovation";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });
        medicalservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want medical service";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });

        massage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to massage";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });

        pestcontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to pestcontrol";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });

        grocerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to grocerry";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });
        repairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to repairs";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });
        makeups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to makeup";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });
        homedelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to HomeDelivery";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
                Toast.makeText(MainActivity3.this,"Your Order has been placed",Toast.LENGTH_SHORT).show();
            }
        });




















    }
//this class provides different Url ka link
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void onRequestPermissionResult(int requestCode,String permission[],int[] grantResults){
        switch (requestCode){
            case MY_PERMISSION_REQUEST__SEND_SMS:{
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Thanks For Permitting!",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(this,"Please allow the permission",Toast.LENGTH_LONG).show();
                }
            }
        }
    }

    public void registercustomer(View view) {
        Intent intent=new Intent(MainActivity3.this,RegistrationPage.class);
        startActivity(intent);
        finish();
    }

    public void Complain(View view) {
        Intent intent=new Intent(MainActivity3.this,Complain.class);
        startActivity(intent);
        finish();
    }
}