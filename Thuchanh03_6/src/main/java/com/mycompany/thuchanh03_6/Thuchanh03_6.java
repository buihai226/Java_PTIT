/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thuchanh03_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Thuchanh03_6 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        sc.nextLine();
        BigInteger tong = BigInteger.ZERO;
        ArrayList<BigInteger> ar = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            String x = sc.nextLine();
            BigInteger tmp = new BigInteger(x);
            ar.add(tmp);
            tong = tong.add(tmp);
        }
        Collections.sort(ar);
        System.out.println(ar.get(0));
        System.out.println(ar.get(ar.size()-1));
        System.out.println(tong);
        
    }
}


//public class KhachHang {
//    private static int cnt = 1;
//    private String ma, ten, gt, dob, dc;
//
//    public KhachHang(String ten, String gt, String dob, String dc) {
//        this.ma = String.format("KH%03d", cnt++);
//        this.ten = ten;
//        this.gt = gt;
//        this.dob = dob;
//        this.dc = dc;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public String getDc() {
//        return dc;
//    }
//
//    public String getMa() {
//        return ma;
//    }
//    
//}

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class KT2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] s = sc.nextLine().split("\\s+");
//        int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
//        TheLoai[] a = new TheLoai[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = new TheLoai(sc.nextLine());
//        }
//        ArrayList<Phim> b = new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            String maTL = sc.nextLine();
//            String ngayChieu = sc.nextLine();
//            String ten = sc.nextLine();
//            int soTap = Integer.parseInt(sc.nextLine());
//            Phim p = new Phim(ten, ngayChieu, soTap);
//            for (TheLoai x : a) {
//                if (maTL.equals(x.getMa())) {
//                    p.setTl(x);
//                    break;
//                }
//            }
//            b.add(p);
//        }
//        Collections.sort(b);
//        for (Phim x : b) {
//            System.out.println(x);
//        }
//    }
//}

//public class Phim implements Comparable<Phim> {
//    private static int cnt = 1;
//    private String ma, ten, ngayChieu;
//    private int soTap;
//    private TheLoai tl;
//
//    public Phim(String ten, String ngayChieu, int soTap) {
//        this.ma = String.format("P%03d", cnt++);
//        this.ten = ten;
//        this.ngayChieu = ngayChieu;
//        this.soTap = soTap;
//    }
//
//    public void setTl(TheLoai tl) {
//        this.tl = tl;
//    }
//    
//    @Override
//    public int compareTo(Phim o) {
//        int y1 = Integer.parseInt(ngayChieu.substring(6)), m1 = Integer.parseInt(ngayChieu.substring(3, 5)), d1 = Integer.parseInt(ngayChieu.substring(0, 2));
//        int y2 = Integer.parseInt(o.ngayChieu.substring(6)), m2 = Integer.parseInt(o.ngayChieu.substring(3, 5)), d2 = Integer.parseInt(o.ngayChieu.substring(0, 2));
//        if (y1 == y2) {
//            if (m1 == m2) {
//                if (d1 == d2) {
//                    if (ten.equals(o.ten)) {
//                        return o.soTap - soTap;
//                    }
//                    return ten.compareTo(o.ten);
//                }
//                return d1 - d2;
//            }
//            return m1 - m2;
//        }
//        return y1 - y2;
//    }
//    @Override
//    public String toString() {
//        return ma + " " + tl.getTen() + " " + ngayChieu + " " + ten + " " + soTap;
//    }
//}