/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tim_thu_khoa_ky_thi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tim_Thu_khoa_ky_thi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> ar = new ArrayList();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<n ; i++)
        {
            Student st = new Student(i+1,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            ar.add(st);
        }
        Collections.sort(ar,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.Overall() == o2.Overall())
                {
                    return Integer.compare(o1.getMa(),o2.getMa());
                }
                else return Double.compare(o2.Overall(),o1.Overall());
            }
        });
        
        double max1 = ar.get(0).Overall();
        for(Student x : ar)
        {
            if(x.Overall() != max1)
            {
                break;
            }
            else{
                System.out.println(x.to_String());
            }
        }
    }
}
