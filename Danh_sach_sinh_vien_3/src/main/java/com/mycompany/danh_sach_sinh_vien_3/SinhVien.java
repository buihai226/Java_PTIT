/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_sinh_vien_3;

/**
 *
 * @author Lenovo
 */
public class SinhVien {
    private String name;
    private String lop;
    private String date;
    private double gpa;
    private String msv;

    public SinhVien(String name, String lop, String date, double gpa,int id) {
        this.name = setName(name);
        this.lop = lop;
        this.date = setDate(date);
        this.gpa = gpa;
        this.msv = String.format("B20DCCN%03d",id);
    }

    public String setName(String name) {
        String[] s = name.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String x : s )
        {
            ans.append(Character.toUpperCase(x.charAt(0)));
            ans.append(x.toLowerCase().substring(1));
            ans.append(" ");
        }
        return ans.toString();
    }

    public double getGpa() {
        return gpa;
    }
    

    public String setDate(String date) {
        StringBuilder ans = new StringBuilder();
        String[] s = date.split("/");
        for(String x : s)
        {
            if(x.length() < 2)
            {
                ans.append("0");
                ans.append(x);
                ans.append("/");
            }
            else if(x.length() == 2)
            {
                ans.append(x);
                ans.append("/");
            }
            else{
                ans.append(x);
            }
        }
        return ans.toString();
    }
    
    public String toString()
    {
        return String.format("%s %s%s %s %.2f",this.msv,this.name,this.lop,this.date,this.gpa);
    }
}
