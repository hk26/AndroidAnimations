package com.example.animationdemostration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class ScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        getSupportActionBar().setTitle("Scale animation");

        Button button;
        ImageView imageView;
        Animation animation;

        button=findViewById(R.id.scale_btn);
        imageView = findViewById(R.id.ant_img);
        animation = AnimationUtils.loadAnimation(this,R.anim.scale);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animation);
            }
        });
    }
}