package com.example.fridaytata;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SaveDataToSQLiteDB extends AppCompatActivity {
    EditText edname,edloc;
    String name, loc;

    TextView textView;

    GouravDBClass dbClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_data_to_sqlite_db);
        edname=findViewById(R.id.editTextText7);
        edloc=findViewById(R.id.editTextText8);
        textView=findViewById(R.id.tvv);

        dbClass= new GouravDBClass(this);

    }

    public void savetodb(View view) {
        name= edname.getText().toString();
        loc= edloc.getText().toString();
        dbClass.saveoperation(name,loc);
        Toast.makeText(this, "data saved!", Toast.LENGTH_SHORT).show();
    }
    public void getloc(View view) {
        name= edname.getText().toString();

        String loc4mdb =dbClass.GetLocwitName(name);

        textView.setText(loc4mdb);

    }
}
