/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tong_phan_so;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tong_Phan_So {
    
    public static long ucln(long tu, long mau)
    {
        if(mau == 0)
        {
            return tu;
        }
        else{
            return ucln(mau,tu%mau);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        long p = tu1*mau2 + tu2*mau1;
        long q = mau1*mau2;
        long uoc = ucln(p,q);
        System.out.printf("%d/%d",p/uoc,q/uoc);
    }
}
