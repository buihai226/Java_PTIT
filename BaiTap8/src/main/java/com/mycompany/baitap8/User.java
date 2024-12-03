/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap8;

/**
 *
 * @author Lenovo
 */
public class User {
    private String username;
    private String pass;

    public User(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
    
    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        User us = (User)(o);
        return username.equals(us.username) && pass.equals(us.pass);
    }
}
