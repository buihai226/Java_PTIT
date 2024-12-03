/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_san_pham_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Danh_Sach_San_pham_2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> ar = new ArrayList();
        for(int i=0 ; i<n ; i++)
        {
            SanPham s = new SanPham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            ar.add(s);
        }
        Collections.sort(ar,new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if(o1.getPrice() == o2.getPrice())
                {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return Integer.compare(o2.getPrice(),o1.getPrice());
            }
        });
        for(SanPham s : ar)
        {
            System.out.println(s.to_String());
        }
        
    }
}
