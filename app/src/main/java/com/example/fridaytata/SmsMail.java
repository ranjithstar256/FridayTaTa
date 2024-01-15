package com.example.fridaytata;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class SmsMail extends AppCompatActivity {
    EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_mail);
        ed1 = findViewById(R.id.editTextText4);
        ed2 = findViewById(R.id.editTextText5);

        ActivityCompat.requestPermissions(SmsMail.this,
                new String[]{android.Manifest.permission.SEND_SMS},
                1);


    }

    public void smssend(View view) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(ed1.getText().toString(), null, ed2.getText().toString(), null, null);
    }

}