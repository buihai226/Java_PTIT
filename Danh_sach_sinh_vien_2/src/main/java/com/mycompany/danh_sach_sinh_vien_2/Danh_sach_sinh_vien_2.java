/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_sinh_vien_2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Danh_sach_sinh_vien_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n; i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String date = sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVien sv = new SinhVien(name,lop,date,gpa,i+1);
            System.out.println(sv.toString());
        }
    }
}
