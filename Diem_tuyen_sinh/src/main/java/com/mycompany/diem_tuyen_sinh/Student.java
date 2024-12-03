/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diem_tuyen_sinh;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String ma;
    private String name;
    private double diem;
    private String dt;
    private int kv;

    public Student(String ma,String name, double diem, String dt, int kv) {
        this.name = setName(name);
        this.diem = diem;
        this.dt = dt;
        this.kv = kv;
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }
    

    public String setName(String name) {
        StringBuilder sb = new StringBuilder();
        String[] str = name.trim().split("\\s+");
        for(String s : str)
        {
            sb.append(s.substring(0,1).toUpperCase()).append(s.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString();
    }
    public double Overall()
    {
        double ans = this.diem;
        if(this.kv == 1)
        {
            ans += 1.5;
        }
        else if(this.kv == 2)
        {
            ans += 1;
        }
        if(!this.dt.equals("Kinh"))
        {
            ans += 1.5;
        }
        return ans;
    }
    public String Kq()
    {
        double ovr = this.Overall();
        if(ovr >= 20.5)
        {
            return "Do";
        }
        else return "Truot";
    }
    
    public String to_String()
    {
        return String.format("%s %s %.1f %s",this.ma,this.name,this.Overall(),this.Kq());
    }
    
    
    
}
