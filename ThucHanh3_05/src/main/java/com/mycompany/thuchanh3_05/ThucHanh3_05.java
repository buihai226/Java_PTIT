/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thuchanh3_05;

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
public class ThucHanh3_05 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> ar = new ArrayList();
        while(sc.hasNext())
        {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            Student st = new Student(msv,name,lop,email,sdt);
            ar.add(st);
        }
        Collections.sort(ar, new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2) {
                int cmp = o1.getLop().compareTo(o2.getLop());
                if(cmp == 0)
                {
                    return o1.getMsv().compareTo(o2.getMsv());
                }
                return cmp;
            }
            
        });
        
        for(Student x : ar)
        {
            System.out.println(x.toString());
        }
    }
}
