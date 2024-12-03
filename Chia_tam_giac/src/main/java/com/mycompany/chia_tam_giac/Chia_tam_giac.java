/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chia_tam_giac;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Chia_tam_giac {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            int height = sc.nextInt();
            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt((double) i / n) * height);
            }
            System.out.println();
        }
    }
}
