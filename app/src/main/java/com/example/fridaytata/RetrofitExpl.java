package com.example.fridaytata;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitExpl extends AppCompatActivity {

    String res;
    TextView tv;

    ProgressDialog pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_expl);
        tv=findViewById(R.id.tex);
        pb= new ProgressDialog(this);

        pb.setMessage("please wait");
    }

    public void getdatafromserver(View view) {
        pb.show();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(GouravApiInterfc.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        GouravApiInterfc api = retrofit.create(GouravApiInterfc.class);

        Call<List<Hero>> call = api.getHeroes();

        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
               res= response.body().get(2).getName().toString();
               pb.dismiss();
            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {

            }
        });


        tv.setText(res);

    }
}