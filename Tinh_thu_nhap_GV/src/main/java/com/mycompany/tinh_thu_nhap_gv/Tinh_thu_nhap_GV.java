/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tinh_thu_nhap_gv;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

class Salary{
    public String ma;
    public String name;
    public long luong;
    public Salary(String ma, String name, long luong)
    {
        this.ma = ma;
        this.name= name;
        this.luong = luong;
    }
    public long phucap()// tra ve so phu cap
    {
        String res = this.ma.substring(0,2);
        if(res.equals("HT"))
        {
            return 2000000;
        }
        else if(res.equals("HP"))
        {
            return 900000;
        }
        else{
            return 500000;
        }
    }
    public long heso()// tra ve he so
    {
        String res = this.ma.substring(2);
        long hs = Integer.valueOf(res);
        return hs;
    }
    public long thunhap()
    {
        String res = this.ma.substring(0,2);
        if(res.equals("HT"))
        {
            long pc = this.heso();
            long tong_thu_nhap = this.luong*pc + this.phucap();
            return tong_thu_nhap;
            
        }
        else if (res.equals("HP"))
        {
            long pc = this.heso();
            long tong_thu_nhap = this.luong*pc + this.phucap();
            return tong_thu_nhap;
        }
        else{
            long pc = this.heso();
            long tong_thu_nhap = this.luong*pc + this.phucap();
            return tong_thu_nhap;
        }
    }
}


public class Tinh_thu_nhap_GV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary sa = new Salary(sc.nextLine(),sc.nextLine(),sc.nextLong());
        System.out.printf("%s %s %d %d %d",sa.ma,sa.name,sa.heso(),sa.phucap(),sa.thunhap());
    }
}
