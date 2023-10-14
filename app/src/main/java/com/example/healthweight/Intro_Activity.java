package com.example.healthweight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.os.Handler;
public class Intro_Activity extends AppCompatActivity {
    private View icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10;
    private Animation iconAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        iconAnimation = AnimationUtils.loadAnimation(Intro_Activity.this ,R.anim.iconplus_animation);
        icon1  = (View) findViewById(R.id.health1);
        icon2  = (View) findViewById(R.id.health2);
        icon3  = (View) findViewById(R.id.health3);
        icon4  = (View) findViewById(R.id.health4);
        icon5  = (View) findViewById(R.id.health5);
        icon6  = (View) findViewById(R.id.health6);
        icon7  = (View) findViewById(R.id.health7);
        icon8  = (View) findViewById(R.id.health8);
        icon9  = (View) findViewById(R.id.health9);
        icon10 = (View) findViewById(R.id.health10);
        icon1.setAnimation(iconAnimation);
        icon2.setAnimation(iconAnimation);
        icon3.setAnimation(iconAnimation);
        icon4.setAnimation(iconAnimation);
        icon5.setAnimation(iconAnimation);
        icon6.setAnimation(iconAnimation);
        icon7.setAnimation(iconAnimation);
        icon8.setAnimation(iconAnimation);
        icon9.setAnimation(iconAnimation);
        icon10.setAnimation(iconAnimation);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent newActivity = new Intent(Intro_Activity.this, MainActivity.class);
                startActivity(newActivity);
            }
        }, 2000);
    }
}
