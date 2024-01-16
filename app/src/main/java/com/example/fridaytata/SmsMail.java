package com.example.fridaytata;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
        //SmsManager smsManager = SmsManager.getDefault();
       // smsManager.sendTextMessage(ed1.getText().toString(), null, ed2.getText().toString(), null, null);

        Intent email = new Intent(Intent.ACTION_SEND);


        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"ranjithpsundar@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "class test mail");
        email.putExtra(Intent.EXTRA_TEXT, "all is well!");

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :")); // no permission needed for mail
    }
    public void dsddsd(View a) {
        String url = "https://api.whatsapp.com/send?phone="+"+918148580586";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }



// types of intent
    // explict intent  ==  switching bw user defined activities
    // implict intent   == opening a build in activity = camera , whatsapp


























}