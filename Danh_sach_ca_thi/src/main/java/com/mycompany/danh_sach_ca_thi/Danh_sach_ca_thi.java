/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_ca_thi;

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
public class Danh_sach_ca_thi {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Exam> ar = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            String ma = String.format("C%03d",i+1);
            Exam ex = new Exam(ma,sc.nextLine(),sc.nextLine(),sc.nextLine());
            ar.add(ex);
        }
        Collections.sort(ar, new Comparator<Exam> () {
            @Override
            public int compare(Exam o1, Exam o2) {
                if(o1.Overall() == o2.Overall())
                {
                    return o1.getMa().compareTo(o2.getMa());
                }
                else return Integer.compare(o1.Overall(),o2.Overall());
            }
        });
        for(Exam x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
