/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_sv_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Danh_sach_Sv_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ar = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String date = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien sv = new SinhVien(name,lop,date,gpa,i+1);
            ar.add(sv);
        }
        Collections.sort(ar,new Comparator<SinhVien>()
        {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o2.getGpa() > o1.getGpa())
                {
                    return 1;
                }
                else return -1;
            }
        });
           
        
        for(SinhVien x : ar)
        {
            System.out.println(x.toString());
        }
    }
}



