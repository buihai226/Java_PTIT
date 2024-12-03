/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BaiTap11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> ar = new ArrayList();
        while(n-->0)
        {
            String name = sc.nextLine();
            String start_date = sc.nextLine();
            String end_date = sc.nextLine();
            Student st = new Student(name,start_date,end_date);
            ar.add(st);
        }
        Collections.sort(ar, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getTime() == o2.getTime())// nếu số ngày online bằng nhau trả về tên theo thứ tự từ điển 
                {
                    return o1.getName().compareTo(o2.getName());
                }
                else return Long.compare(o2.getTime(), o1.getTime());
            }
        });
        for(Student x : ar)
        {
            System.out.printf("%s %d",x.getName(),x.getTime());
            System.out.println();
        }
    }
}
