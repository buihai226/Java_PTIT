/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.xep_loai;

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
public class Xep_loai {

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
        
        Collections.sort(ar,new Comparator<Student> () {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.Overall(), o1.Overall());
            }
        });
        
        for(Student x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
