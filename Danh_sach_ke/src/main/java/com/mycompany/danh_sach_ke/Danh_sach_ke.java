/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_ke;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Danh_sach_ke {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][n];
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> b = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    b.add(j);
                }
            }
            System.out.print("List(" + i + ") = ");
            b.forEach(j -> System.out.print(j + " "));
            System.out.println();
        }
    }
}
