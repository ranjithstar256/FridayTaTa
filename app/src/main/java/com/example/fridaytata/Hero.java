package com.example.fridaytata;

import com.google.gson.annotations.SerializedName;

public class Hero{

    @SerializedName("name")
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


