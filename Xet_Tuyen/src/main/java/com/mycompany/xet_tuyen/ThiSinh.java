/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xet_tuyen;

/**
 *
 * @author Lenovo
 */
public class ThiSinh {
    private String name;
    private String date;
    private double d1,d2;
    private String ma;

    public ThiSinh(int idx, String name,String date, double d1, double d2) {// mã theo số int
        this.name = setName(name);
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.ma = String.format("PH%02d",idx);
    }
    
    public int tuoi()
    {
        String[] tmp = date.split("/");
        int year = Integer.parseInt(tmp[2]);
        int age = 2021 - year;
        return age;
    }
    public String setName(String name){
        StringBuilder sb = new StringBuilder();
        String[] tmp = name.trim().split("\\s+");
        for(String x : tmp)
        {
            sb.append(x.substring(0,1).toUpperCase()).append(x.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString();
    }
    public double bonus()
    {
        if(d1 >=8 && d2 >= 8)
        {
            return 1;
        }
        else if(d1 >= 7.5 && d2 >= 7.5)
        {
            return 0.5;
        }
        return 0;
    }
    public double Overall()
    {
        double ans = (d1 + d2) / 2;
        ans += this.bonus();
        if(ans > 10)
        {
            ans = 10;
        }
        return Math.round(ans);
    }
    public String Ketqua()
    {
        double ans = this.Overall();
        if(ans == 9 || ans == 10)
        {
            return "Xuat sac";
        }
        else if(ans == 8)
        {
            return "Gioi";
        }
        else if(ans == 7)
        {
            return "Kha";
        }
        else if(ans >=5 && ans <= 6)
        {
            return "Trung binh";
        }
        else return "Truot";
    }
    
    public String to_String()
    {
        return this.ma + " " + this.name + this.tuoi() + " " + (int)this.Overall() + " " + this.Ketqua();
    }
    
    
    
}
