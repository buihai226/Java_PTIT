/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.in_ma_tran;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class In_ma_tran {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int[] a = new int[n];
                for (int j = 0; j < n; j++) {
                    a[j] = sc.nextInt();
                }
                if (i % 2 == 0) {
                    for (int j : a) {
                        System.out.print(j + " ");
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        System.out.print(a[j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
