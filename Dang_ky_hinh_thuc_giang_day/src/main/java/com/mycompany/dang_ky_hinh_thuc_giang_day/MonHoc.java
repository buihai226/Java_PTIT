/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dang_ky_hinh_thuc_giang_day;

/**
 *
 * @author Lenovo
 */
public class MonHoc {
    private String ma;
    private String name;
    private int tc;
    private String lythuyet;
    private String thuchanh;

    public MonHoc(String ma, String name, int tc, String lythuyet, String thuchanh) {
        this.ma = ma;
        this.name = name;
        this.tc = tc;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }

    public String getThuchanh() {
        return thuchanh;
    }

    public String getMa() {
        return ma;
    }
    public boolean check(String thuchanh)
    {
        if(thuchanh.equals("Truc tuyen"))
        {
            return true;
        }
        else{
            String tmp = thuchanh.substring(thuchanh.length() - 13);
            if(tmp.equals(".ptit.edu.vn"))
            {
                return true;
            }
            else return false;
        }
    }
    
    public String to_String()
    {
        return this.ma + " " + this.name + " " + this.tc + " " + this.lythuyet + " " + this.thuchanh;
    }
}
