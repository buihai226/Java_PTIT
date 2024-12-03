/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tim_thu_khoa_ky_thi;

import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Student {
    private int ma;
    private String name;
    private String date;
    private double d1,d2,d3;

    public Student(int ma, String name, String date, double d1, double d2, double d3) {
        this.ma = ma;
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }    

    public int getMa() {
        return ma;
    }
    
    public double Overall()
    {
        return d1+d2+d3;
    }
    public String to_String()
    {
        return String.format("%s %s %s %.1f",ma,name,date,this.Overall());
    }
}
