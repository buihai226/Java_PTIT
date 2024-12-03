/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sap_xep_ma_tran;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Sap_xep_ma_tran {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("MATRIX.in"));
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt(), m = scn.nextInt(), i = scn.nextInt();
            int[][] a = new int[n][m];
            i--;
            for (int j = 0; j < n; j++)
                for (int k = 0; k < m; k++) a[j][k] = scn.nextInt();
            int[] b = new int[n];
            for (int j = 0; j < n; j++) b[j] = a[j][i];
            Arrays.sort(b);
            for (int j = 0; j < n; j++) a[j][i] = b[j];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    System.out.print(a[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
