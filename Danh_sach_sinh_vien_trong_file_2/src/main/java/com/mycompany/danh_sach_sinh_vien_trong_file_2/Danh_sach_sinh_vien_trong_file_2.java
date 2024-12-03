/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_sinh_vien_trong_file_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Danh_sach_sinh_vien_trong_file_2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<SinhVien> ar = new ArrayList();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<n ; i++)
        {
            String msv = String.format("B20DCCN%03d", i+1);
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String date = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien sv = new SinhVien(name,lop,date,gpa);
            System.out.print(msv + " ");
            System.out.println(sv.toString());
        }
    }
}
