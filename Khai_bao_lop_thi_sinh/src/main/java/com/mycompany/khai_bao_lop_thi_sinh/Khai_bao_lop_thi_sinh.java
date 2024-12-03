/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khai_bao_lop_thi_sinh;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

class Sinhvien{
    private String name;
    private String date;
    private double d1,d2,d3;
    public Sinhvien(String name,String date,double d1,double d2,double d3)
    {
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public double getScore()
    {
        return d1+d2+d3;
    }
    public String getName()
    {
        return this.name;
    }
    public String getDate()
    {
        return this.date;
    }
    
}


public class Khai_bao_lop_thi_sinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        Sinhvien sv = new Sinhvien(name,date,d1,d2,d3);
        System.out.printf("%s %s %.1f",sv.getName(),sv.getDate(),sv.getScore());
    }
}
