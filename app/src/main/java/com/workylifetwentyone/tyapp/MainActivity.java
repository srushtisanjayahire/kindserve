package com.workylifetwentyone.tyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView textView,textview2;
    LottieAnimationView lottieAnimationView;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottieAnimationView=findViewById(R.id.lottie);
        textView=findViewById(R.id.text1);
        textview2=findViewById(R.id.text2);
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                finish();
            }
        },5000);


        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        textView.animate().translationX(-4000).setDuration(1000).setStartDelay(4000);
        textview2.animate().translationX(4000).setDuration(1000).setStartDelay(4000);
    }
}