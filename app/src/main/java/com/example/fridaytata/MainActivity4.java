package com.example.fridaytata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    WebView wb;
    Button b;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        wb=findViewById(R.id.wv);
        b=findViewById(R.id.btn);
        ed=findViewById(R.id.ed);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wb.loadUrl("https://"+ed.getText().toString());
            }
        });
    }
}