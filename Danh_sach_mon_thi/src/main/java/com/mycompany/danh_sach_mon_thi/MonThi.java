/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_mon_thi;

/**
 *
 * @author Lenovo
 */
public class MonThi {
    private String maMH;
    private String name;
    private String HTThi;

    public MonThi(String maMH, String name, String HTThi) {
        this.maMH = maMH;
        this.name = name;
        this.HTThi = HTThi;
    }

    public String getMaMH() {
        return maMH;
    }
    public String to_String()
    {
        return String.format("%s %s %s",this.maMH,this.name,this.HTThi);
    }
    
}
