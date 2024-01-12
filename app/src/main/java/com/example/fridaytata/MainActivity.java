package com.example.fridaytata;

        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;    /// declaration above oncreate mtd // global dec

    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= findViewById(R.id.tataji);
        b2= findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a = new AlertDialog.Builder(MainActivity.this);

                a.setTitle("Do you want to proceed further?");
                a.setMessage("click yes for next screen");
                a.setIcon(android.R.drawable.star_big_on);

                a.setPositiveButton("positive", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "positive clicked", Toast.LENGTH_SHORT).show();
                    }
                });


                a.setNegativeButton("nega",null);
                a.setNeutralButton("nau",null);

                a.show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gouv = new Intent(MainActivity.this,MainActivity2.class);
                gouv.putExtra("locationone","Delhi");
                gouv.putExtra("locationtwo","Chennai");
                startActivity(gouv);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shreya,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void gav(MenuItem item) {
        Toast.makeText(MainActivity.this,"settings selected!",Toast.LENGTH_SHORT).show();
    }


    // Activity
    // EACH AND EVERY SCREEN IS CALLED AS ACTIVITY IN ANDROID
}









