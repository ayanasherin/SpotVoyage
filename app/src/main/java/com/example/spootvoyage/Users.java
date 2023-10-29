package com.example.spootvoyage;

public class Users {

    String username;
    String email;
    String bio;

    String id;
    public Users() {
    }

    public Users(String id,String name, String email, String bio) {
        this.id = id;
        this.username = name;
        this.email = email;
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }

    public String getEmail() {
        return email;
    }
    public String getUserName() {
        return username;
    }


}