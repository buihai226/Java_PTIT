/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_trung_tuyen;

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
public class Danh_sach_trung_tuyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<Student> ar = new ArrayList();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<n ; i++)
        {
            Student st = new Student(sc.nextLine() , sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            ar.add(st);
        }
        int num = Integer.parseInt(sc.nextLine());// so luong thi sinh
        Collections.sort(ar,new Comparator<Student> () {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.Overall() == o2.Overall())
                {
                    return o1.getMsv().compareTo(o2.getMsv());
                }
                else return Double.compare(o2.Overall(),o1.Overall());
            }
        });
        // vị trí thứ num luôn là điểm chuẩn
        double diem_chuan = ar.get(num-1).Overall(); // diem chuan
        System.out.println(diem_chuan);
        for(Student x : ar)
        {
            System.out.print(x.to_String());
            if(x.Overall() >= diem_chuan)
            {
                System.out.println(" TRUNG TUYEN");
            }
            else{
                System.out.println(" TRUOT");
            }
        }
        
        
        
            
    }
}


