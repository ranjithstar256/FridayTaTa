package com.example.fridaytata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView3);
        String one = getIntent().getStringExtra("locationone");
        String two = getIntent().getStringExtra("locationtwo");

        tv.setText(one+"\n"+two);


    }
}