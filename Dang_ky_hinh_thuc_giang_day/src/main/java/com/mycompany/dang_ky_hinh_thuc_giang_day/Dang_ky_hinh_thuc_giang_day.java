/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dang_ky_hinh_thuc_giang_day;

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
public class Dang_ky_hinh_thuc_giang_day {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> ar = new ArrayList();
        for(int i=0 ; i<n ; i++)
        {
            MonHoc mh = new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine());
            ar.add(mh);
        }
        Collections.sort(ar,new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(MonHoc x : ar)
        {
            if(!x.getThuchanh().equals("Truc tiep"))
            {
                System.out.println(x.to_String());
            }
        }
    }
}
