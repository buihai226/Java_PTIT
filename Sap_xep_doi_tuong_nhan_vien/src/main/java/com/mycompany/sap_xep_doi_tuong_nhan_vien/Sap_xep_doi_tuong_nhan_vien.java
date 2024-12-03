/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sap_xep_doi_tuong_nhan_vien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Sap_xep_doi_tuong_nhan_vien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ar = new ArrayList();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<n ; i++)
        {
            String mnv = String.format("000%02d",i+1);
            NhanVien nv = new NhanVien(mnv,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ar.add(nv);
        }
        
//        Collections.sort(ar,new Comparator<NhanVien> () {
//            @Override
//            public int compare(NhanVien o1, NhanVien o2) {
//                String[] d_1 = o1.getDate().split("/");
//                String[] d_2 = o2.getDate().split("/");
//                int[] d1 = new int[3];
//                int[] d2 = new int[3];
//                for(int i=0 ; i<3 ; i++)
//                {
//                    d1[i] = Integer.parseInt(d_1[i]);
//                    d2[i] = Integer.parseInt(d_2[i]);
//                }
//                if(d1[2] != d2[2])
//                {
//                    return Integer.compare(d1[2], d2[2]);
//                }
//                else if(d1[1] != d2[1])
//                {
//                    return Integer.compare(d1[1], d2[1]);
//                }
//                else return Integer.compare(d1[0],d2[0]);
//            }
//        });
        
        for(NhanVien x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
