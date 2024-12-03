/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_sinh_vien_trong_file_2;

/**
 *
 * @author Lenovo
 */
public class SinhVien {
    private String name;
    private String lop;
    private String date;
    private double gpa;

    public SinhVien(String name, String lop, String date, double gpa) {
        this.name = name;
        this.lop = lop;
        setDate(date);
        this.gpa = gpa;
    }
    
    public void setDate(String date) {
        StringBuilder sb = new StringBuilder();
        String[] s = date.split("/");
        for(String tmp : s)
        {
            if(tmp.length() < 2)
            {
                sb.append("0").append(tmp);
                sb.append("/");
            }
            else if(tmp.length() == 2)
            {
                sb.append(tmp);
                sb.append("/");
            }
            else sb.append(tmp);
            
        }
        String ans = sb.toString();
        this.date = ans;
        
    }
    public String toString()
    {
        return String.format("%s %s %s %.2f",this.name,this.lop,this.date,this.gpa);
    }
    
}
