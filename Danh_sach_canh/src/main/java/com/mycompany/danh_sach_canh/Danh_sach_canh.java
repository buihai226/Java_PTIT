/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_canh;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Danh_sach_canh {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int tmp = sc.nextInt();
                if (j>i && tmp == 1) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
