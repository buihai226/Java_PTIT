/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tinh_diem_trung_binh;

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
public class Tinh_diem_trung_binh {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> ar = new ArrayList();
        for(int i=0 ; i<n ; i++)
        {
            String ma = String.format("SV%02d", i+1);
            Student st = new Student(ma,sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            ar.add(st);
        }
        Collections.sort(ar,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.Overall() == o2.Overall())
                {
                    return o1.getMa().compareTo(o2.getMa());
                }
                else return Double.compare(o2.Overall(),o1.Overall());
            }
        } );
        
      
        int idx = 0;// thứ hạng
        int num = ar.size();
        while(idx < num)
        {
            double diem = ar.get(idx).Overall();
            System.out.println(ar.get(idx).to_String() + " " + (idx+1));
            int same = idx;// cùng thứ hạng
            idx++;
            if(idx < num && diem == ar.get(idx).Overall())
            {
                while(diem == ar.get(idx).Overall() && idx < num)
                {
                    System.out.println(ar.get(idx).to_String() + " " + (same+1) );
                    idx++;
                }
            }  
        }
    }
}
