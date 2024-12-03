/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Lenovo
 */
public class Phim {
    private String theloai;
    private String name;
    private String date;
    private int sotap;
    private String ma;

    public Phim(String ma, String theloai, String date, String name,int sotap) {
        this.theloai = theloai;
        this.date = date;
        this.sotap = sotap;
        this.name = name;
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getSotap() {
        return sotap;
    }

    
    public int soNgay()// tra ve so ngay
    {
        String[] str = date.split("/");
        LocalDate day = LocalDate.of(Integer.parseInt(str[2]), Integer.parseInt(str[1]), Integer.parseInt(str[0]));
        int ans = day.getDayOfYear();
        return ans;
    }
    
    public String to_String()
    {
        return String.format("%s %s %s %s %d", ma , theloai , date, name, sotap);
    }
    
}
