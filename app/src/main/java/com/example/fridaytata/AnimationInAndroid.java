package com.example.fridaytata;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

public class AnimationInAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_in_android);
    }

    public void ani(View abc) {
        Animation a = AnimationUtils.loadAnimation(AnimationInAndroid.this,R.anim.gourav);
        abc.startAnimation(a);
    }
}