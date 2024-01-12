package com.example.fridaytata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    TextView tv;
    Button b1,b2,b3;

    String s1, s2, s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ed1=findViewById(R.id.editTextText);
        ed2=findViewById(R.id.editTextText2);
        tv=findViewById(R.id.textView3);
        ed3=findViewById(R.id.editTextText3);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                s3 = ed3.getText().toString();

                Toast.makeText(MainActivity3.this, s1+"\n"+s2+"\n"+s3, Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                s3 = ed3.getText().toString();

               tv.setText(s1+"\n"+s2+"\n"+s3);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                s3 = ed3.getText().toString();

                Intent gouv = new Intent(MainActivity3.this,MainActivity2.class);
                gouv.putExtra("locationone",s1);
                gouv.putExtra("locationtwo",s2);
                gouv.putExtra("locationthree",s3);
                startActivity(gouv);
            }
        });
    }
}