package com.example.fridaytata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GouravApiInterfc {
    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
