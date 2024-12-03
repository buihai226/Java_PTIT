/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai_toan_tinh_cong_p2;

import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class Bai_toan_tinh_cong_p2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        long lcb = sc.nextLong();
        long nc = sc.nextLong();
        sc.nextLine();
        String cv = sc.nextLine().trim();
        NhanVien nv = new NhanVien(name,lcb,nc,cv);
        System.out.printf("%s %s %d %d %d %d",nv.getMnv(),nv.getName(),nv.getLcb(),nv.thuong(),nv.phucap(),nv.thunhap());
        // 
    }
}
