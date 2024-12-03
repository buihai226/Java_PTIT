/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai_toan_tuyen_sinh;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Bai_toan_tuyen_sinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        SinhVien sv = new SinhVien(id,name,toan,ly,hoa);
        System.out.print(sv.toString());
    }
}
