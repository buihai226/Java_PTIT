/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lap_bang_tinh_cong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */


public class Lap_bang_tinh_cong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNV = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> ar = new ArrayList();
        while(soNV-->0)
        {
           String hoTen = sc.nextLine();
           long lcb = sc.nextLong();
           int nc = sc.nextInt();
           sc.nextLine();
           String chucvu = sc.nextLine();
           NhanVien e = new NhanVien(hoTen,lcb,nc,chucvu);
           ar.add(e);
        }
        for(NhanVien x : ar)
        {
            System.out.print(x.toString());
        }
    }
}
