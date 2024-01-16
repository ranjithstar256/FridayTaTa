package com.example.fridaytata;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SFRead extends AppCompatActivity {
    SharedPreferences sf;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sfread);
        sf=getSharedPreferences("sfname",MODE_PRIVATE);
        tv=findViewById(R.id.textView2);
    }

    public void sfread(View view) {
        tv.setText(sf.getString("grv","def val"));
    }
}