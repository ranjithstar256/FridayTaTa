package com.example.fridaytata;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }


    public void abhi(View view) {

        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);

        DatePickerDialog ata = new DatePickerDialog(MainActivity5.this
                , new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Toast.makeText(MainActivity5.this, ""+dayOfMonth+"/"+(1+month)+"/"+year, Toast.LENGTH_SHORT).show();
            }
        },
                year,month,day);
        ata.show();
    }

    public void timeabc(View view) {

        Calendar c = Calendar.getInstance();
         int hour = c.get(Calendar.HOUR);
         int min = c.get(Calendar.MINUTE);

        TimePickerDialog tp = new TimePickerDialog(MainActivity5.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            }
        },hour, min, false);
        tp.show();
    }
}