/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_toan_tuyen_sinh;

/**
 *
 * @author Lenovo
 */
public class SinhVien {
    private String id;
    private String name;
    private double toan;
    private double ly;
    private double hoa;

    public SinhVien(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double Khuvuc()// return điểm cộng
    {
        char x = this.id.charAt(2);
        if(x == '1')
        {
            return 0.5;
        }
        else if(x == '2')
        {
            return 1.0;
        }
        else return 2.5;
    }
    
    public double Overall()// return tổng điểm
    {
        double sum = toan*2 + ly + hoa;
        return sum;
    }
    public String ans()// return kết quả
    {
        double sum = this.Overall() + this.Khuvuc();
        if(sum >= 24.0)
        {
            return "TRUNG TUYEN";
        }
        else return "TRUOT";
    }
    public String toString()
    {
        double kv = this.Khuvuc();// điểm cộng
        String ans_kv;
        double all = this.Overall(); // điểm tổng
        String ans_all;
        if(kv - Math.round(kv) == 0)// là int
        {
            ans_kv = String.format("%d",(int)kv);
        }
        else ans_kv = String.format("%.1f", kv);
        if(all - Math.round(all) == 0)
        {
            ans_all = String.format("%d" , (int) all);
        }
        else ans_all = String.format("%.1f",all);
        
        String ans1 = String.format("%s %s %s %s %s",this.id , this.name,ans_kv,ans_all,this.ans());
        return ans1;
    }
}
