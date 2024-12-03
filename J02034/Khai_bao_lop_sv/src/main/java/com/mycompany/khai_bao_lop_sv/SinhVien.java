/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khai_bao_lop_sv;

/**
 *
 * @author Lenovo
 */
public class SinhVien {
    String name;
    String lop;
    String date;
    float gpa;
    String msv;
    public SinhVien(String name,String lop,String date,float gpa)
    {
        this.name = name;
        this.lop = lop;
        this.date = chuanHoa(date);
        this.gpa = gpa;
        
    }
    public void input()
    {
    }
    private String chuanHoa(String s)
    {
        String[] a = s.split("/");
        if(a[0].length() == 1)
        {
            a[0] = "0" + a[0];
        }
        if(a[1].length() == 1)
        {
            a[1] = "0" + a[1];
        }
        return a[0]+"/"+a[1]+"/"+a[2];
    }
    public void output()
    {
        System.out.printf("%s %s %s %.2f",name,lop,date,gpa);
    }
}
