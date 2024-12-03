/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xep_loai;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String ma;
    private String name;
    private double d1,d2,d3;

    public Student(String ma, String name, double d1, double d2, double d3) {
        this.ma = ma;
        this.name = setName(name);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public double Overall()
    {
        return (d1*25 + d2*35 + d3*40) / 100;
    }
    
    public String ketqua(){
        double ans = this.Overall();
        if(ans > 8)
        {
            return "GIOI";
        }
        else if(ans < 8 && ans >= 6.5)
        {
            return "KHA";
        }
        else if(ans < 6.5 && ans >=5 )
        {
            return "TRUNG BINH";
        }
        else return "KEM";
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
    
    public String to_String()
    {
        String diem = String.format("%.2f",this.Overall());
        return this.ma + " " + this.name  + diem + " " + this.ketqua();
    }
}
