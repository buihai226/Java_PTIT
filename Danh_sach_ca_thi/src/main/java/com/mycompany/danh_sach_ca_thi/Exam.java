/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_ca_thi;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Lenovo
 */
public class Exam {
    private String date;
    private String time;
    private String id; // phong
    private String ma;

    public Exam(String ma, String date, String time, String id) {
        this.date = date;
        this.time = time;
        this.id = id;
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }
    
    
    public int Overall()// tra ve so phut
    {
        String[] tmp1 = date.split("/");// date,month,year
        String[] tmp2 = time.split(":");
//        Integer.parseInt(tmp1[1]);

        
        LocalDateTime ans = LocalDateTime.of(Integer.parseInt(tmp1[2]), Integer.parseInt(tmp1[1]), Integer.parseInt(tmp1[0]), Integer.parseInt(tmp2[0]), Integer.parseInt(tmp2[1]));
        LocalDateTime num = LocalDateTime.of(1970,1,1,0,0);
        
        return (int)ChronoUnit.MINUTES.between(num, ans);
    }
    public String to_String()
    {
        return this.ma + " " + this.date + " " + this.time + " " + this.id;
    }
    
}
