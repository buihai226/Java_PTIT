/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tich_ma_tran_chuyen_vi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tich_ma_tran_chuyen_vi {

     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int dem = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n]; 
            int ans[][] = new int[n][n]; 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        ans[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + dem++ + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
