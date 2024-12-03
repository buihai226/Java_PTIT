/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j01002;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class J01002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test; test = sc.nextInt();
        while(test>0)
        {
            long n;
            n = sc.nextLong();
            long tong;
            tong = (n+1)*n/2;
            System.out.println(tong);
            test-=1;
        }
    }
}
