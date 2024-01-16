package com.example.fridaytata;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ShardPrefSave extends AppCompatActivity {

    EditText ed;

    SharedPreferences sf;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shard_pref_save);
        ed=findViewById(R.id.editTextText6);

        sf=getSharedPreferences("sfname",MODE_PRIVATE);
        editor=sf.edit();

    }

    public void savesf(View view) {
            editor.putString("grv",ed.getText().toString());
            editor.commit();
    }
    public void gotonxt(View view) {

        startActivity(new Intent(ShardPrefSave.this, SFRead.class));
    }

}