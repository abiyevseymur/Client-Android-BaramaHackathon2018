package com.example.abiye.endowed.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abiye on 11/25/2018.
 */

public class User {
    @SerializedName("name")
    public String name;
    @SerializedName("id")
    public String id;

    public User(String name, String job) {
        this.name = name;
    }
}
