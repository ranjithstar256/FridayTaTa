package com.example.fridaytata;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class SensorsInAndroid extends AppCompatActivity {
    TextView tv;
    SensorManager sm = null;

    List sensorlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors_in_android);
        tv=findViewById(R.id.textView);


        sm=(SensorManager) getSystemService(SENSOR_SERVICE);

        sensorlist=sm.getSensorList(Sensor.TYPE_ACCELEROMETER);

        sm.registerListener(new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                float[] momentvalues =event.values;
                tv.setText(
                        "x axis = "+momentvalues[0]+"\n y axis = "+momentvalues[1]+" \n z axis = "+momentvalues[2]);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        }, (Sensor) sensorlist.get(0), SensorManager.SENSOR_DELAY_NORMAL);

    }
}