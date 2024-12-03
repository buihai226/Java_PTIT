/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinh_diem_trung_binh;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String name;
    private String ma;
    private double d1,d2,d3;

    public Student(String ma, String name, double d1, double d2, double d3) {
        this.name = setName(name);
        this.ma = ma;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getMa() {
        return ma;
    }
    
    public String setName(String name)
    {
        StringBuilder sb = new StringBuilder();
        String[] tmp = name.trim().split("\\s+");
        for(String x : tmp)
        {
            sb.append(x.substring(0,1).toUpperCase()).append(x.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString();
    }
    public double Overall()
    {
        return (d1*3+d2*3+d3*2)/8;
    }
    
    
    public String to_String()
    {
        double ans = this.Overall();
        return String.format("%s %s%.2f",this.ma,this.name,ans);
    }
}
