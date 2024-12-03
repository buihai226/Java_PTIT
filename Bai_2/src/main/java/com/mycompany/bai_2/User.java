/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_2;

/**
 *
 * @author Lenovo
 */
public class User {
    public String dangnhap;
    public String matkhau;
//    public static int id;

    public User(String dangnhap, String matkhau) {
        this.dangnhap = dangnhap;
        this.matkhau = matkhau;
//        this.id = id;
//        id++;
    }

    public String getDangnhap() {
        return dangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }
    
    @Override
    public String toString()
    {
        return dangnhap + " " + matkhau;
    }
}
