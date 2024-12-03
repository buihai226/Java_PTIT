/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_toan_tinh_cong_p2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class NhanVien {
    private String mnv;
    private String name;
    private long lcb;
    private long nc;
    private String cv;
    private static int id = 1;

    public NhanVien(String name, long lcb, long nc, String cv) {
        this.mnv = String.format("NV%02d", id);
        id+=1;
        this.name = name;
        this.lcb = lcb;
        this.nc = nc;
        this.cv = cv;
    }
    
    

    public String getMnv() {
        return mnv;
    }

    public String getName() {
        return name;
    }
    
    
    public long getLcb() { // tra ve luong 1 thang
        long Ngaycong = this.getNc();
        
        return lcb*Ngaycong;
    }
    
    public long thunhap()// tra ve tien thuong
    {
        long luongcb = this.getLcb();
            long bonus = this.thuong();
            return luongcb+bonus+this.phucap();
    }
    public long thuong()// tra ve tien thuong
    {
        long Ngaycong = this.getNc();
        if(Ngaycong >= 25)
        {
            long luongcb = this.getLcb();
            return Math.round(luongcb * 20.0/100);
        }
        else if(Ngaycong < 25 && Ngaycong >= 22)
        {
            long luongcb = this.getLcb();
            return Math.round(luongcb * 10.0/100);
        }
        else{
            return 0;
        }
    }

    public long getNc() {
        return nc;
    }

    public String getCv() {
        return cv;
    }
    
    public long phucap()
    {
        String chucvu = this.getCv();
        if(chucvu.equals("GD"))
        {
            return 250000;
        }
        else if(chucvu.equals("PGD"))
        {
            return 200000;
        }
        else if(chucvu.equals("TP"))
        {
            return 180000;
        }
        else{
            return 150000;
        }
    }
}
