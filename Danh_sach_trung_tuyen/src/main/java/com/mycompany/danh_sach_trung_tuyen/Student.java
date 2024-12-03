/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_trung_tuyen;

import java.text.DecimalFormat;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String msv;
    private String name;
    private double toan,ly,hoa;

    public Student(String msv, String name, double toan, double ly, double hoa) {
        this.msv = msv;
        this.name = setName(name);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getMsv() {
        return msv;
    }
    
    
    public String setName(String name)// ten chuan hoa
    {
        StringBuilder sb = new StringBuilder();
        String[] str = name.trim().split("\\s+");
        for(String s : str)
        {
            sb.append(s.substring(0,1) .toUpperCase()).append(s.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    
    public double bonus()// diem uu tien
    {
        String tmp = msv.substring(0,3);
        if(tmp.equals("KV1"))
        {
            return 0.5;
        }
        else if(tmp.equals("KV2"))
        {
            return 1.0;
        }
        else{
            return 2.5;
        }
    }
    public String kq(){
        return null;
    }
    
    
    public static String removeZero(double number) {
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(number);
    }
    
    
    
    
    public double Overall()// tổng điểm
    {
        return toan*2 + ly + hoa + this.bonus();
    }
    
    
    public String to_String()// chua co TRUOT,DO
    {
        return this.msv + " " + this.name + " " + removeZero(this.bonus()) + " " +removeZero(this.Overall());
    }
}
