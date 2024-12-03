/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_mat_hang;

/**
 *
 * @author Lenovo
 */
public class Item {
    private String name;
    private String dv; //don vi tinh
    private long buy;
    private long sell;
    private static int id = 0;
    private String maMH;
    public Item(String name, String dv, long buy, long sell)
    {
        this.name = name;
        this.dv = dv;
        this.buy = buy;
        this.sell = sell;
        id++;
        this.maMH = String.format("MH%03d", id);
    }
    public String getName() {
        return name;
    }

    public String getDv() {
        return dv;
    }

    public long getBuy() {
        return buy;
    }

    public long getSell() {
        return sell;
    }
    public long money()//tien lai
    {
        return sell-buy;
    }
    public int getID()
    {
        return this.id;
    }
    public String getmaMH()
    {
        return this.maMH;
    }
    
}
