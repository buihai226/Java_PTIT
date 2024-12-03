/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khai_bao_lop_sv;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Khai_bao_lop_sv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        String msv = "B20DCCN";
        for(int i=0 ; i<n ; i++)
        {
            sc.nextLine();
            sv[i] = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextFloat());
        }
        for(int i=0 ; i<n ; i++)
        {
            String id = String.valueOf(i+1);
            while(id.length()<3)
            {
                id = "0"+id;
            }
            System.out.print(msv+id+" ");
            sv[i].output();
            System.out.println();
        }
    }
}
