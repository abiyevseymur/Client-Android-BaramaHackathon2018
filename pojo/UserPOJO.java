package com.example.abiye.endowed.pojo;

/**
 * Created by abiye on 11/24/2018.
 */

public class UserPOJO {
    /*
    * {"user":"test"}
    * */

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserPOJO{" +
                "user='" + user + '\'' +
                '}';
    }
}
