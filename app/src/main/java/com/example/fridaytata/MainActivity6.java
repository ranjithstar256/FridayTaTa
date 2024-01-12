package com.example.fridaytata;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mediaPlayer = MediaPlayer.create(this,R.raw.isai);
    }


    public void ply(View view) {
            mediaPlayer.start();
    }

    public void pau(View view) {
        mediaPlayer.pause();
    }

    public void stp(View view) {

        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this,R.raw.isai);

    }
}