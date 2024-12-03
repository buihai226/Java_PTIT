/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_san_pham_2;

/**
 *
 * @author Lenovo
 */
public class SanPham {
    private String ma;
    private String name;
    private int price;
    private int month;

    public SanPham(String ma, String name, int price, int month) {
        this.ma = ma;
        this.name = name;
        this.price = price;
        this.month = month;
    }

    public String getMa() {
        return ma;
    }

    public int getPrice() {
        return price;
    }
    public String to_String()
    {
        return String.format( "%s %s %d %s " , this.ma,this.name,this.price,this.month);
    }
}
