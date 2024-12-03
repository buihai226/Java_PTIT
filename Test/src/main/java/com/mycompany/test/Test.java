/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

class SinhVien{
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private double gpa;
    
    public SinhVien(String maSinhVien, String hoTen, String lop, double gpa)
    {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public double getGpa()
    {
        return gpa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
    
    public String toString()
    {
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + String.format("%.2f",this.gpa);
    }
}


public class Test {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(s.charAt(4));
    }
}
