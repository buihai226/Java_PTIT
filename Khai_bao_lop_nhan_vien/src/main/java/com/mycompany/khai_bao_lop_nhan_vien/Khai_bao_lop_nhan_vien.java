/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khai_bao_lop_nhan_vien;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

class Nhanvien{
    public String name;
    public String sex;
    public String date;
    public String address;
    public String mst;
    public String date_work;
    public String mnv;
    
    public Nhanvien(String name,String sex,String date,String address,String mst,String date_work)
    {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.address = address;
        this.date_work = date_work;
        this.mst = mst;
        this.mnv = "00001";
    }
}

public class Khai_bao_lop_nhan_vien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nhanvien nv = new Nhanvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.printf("%s %s %s %s %s %s %s",nv.mnv,nv.name,nv.sex,nv.date,nv.address,nv.mst,nv.date_work);
    }
}
