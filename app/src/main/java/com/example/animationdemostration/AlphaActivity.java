package com.example.animationdemostration;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AlphaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        getSupportActionBar().setTitle("Alpha animation");


        Button button;
        ImageView imageView_moon,imageView_sun;
        Animation animation_moon,animation_sun;

        imageView_moon = findViewById(R.id.moon_img);
        button = findViewById(R.id.alpha_btn);
        animation_moon = AnimationUtils.loadAnimation(this,R.anim.alpha);

        imageView_sun =findViewById(R.id.sun_img);
        animation_sun = AnimationUtils.loadAnimation(this,R.anim.alpha_two);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_moon.startAnimation(animation_moon);
                imageView_sun.startAnimation(animation_sun);
            }
        });

    }
}