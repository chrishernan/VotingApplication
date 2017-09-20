package com.example.christianhernandez.votingapplication;

/**
 * Created by christian.hernandez on 9/5/17.
 */

public class User {

    private int id;
    private String name;
    private String email;
    private String password;

    //getters
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //setters

    public void setId(int new_id){
        this.id=new_id;
    }

    public void setName(String new_name){
        this.name= new_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
