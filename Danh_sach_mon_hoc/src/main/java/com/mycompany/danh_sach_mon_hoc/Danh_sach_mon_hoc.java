/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_mon_hoc;

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
public class Danh_sach_mon_hoc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> ar = new ArrayList();
        for(int i=0 ; i<n ; i++)
        {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int tc = Integer.parseInt(sc.nextLine());
            Subject s = new Subject(ma,name,tc);
            ar.add(s);
        }
        Collections.sort(ar,new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Subject s: ar)
        {
            System.out.println(s.toString());
        }
    }
}
