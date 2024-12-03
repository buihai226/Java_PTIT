/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khoang_cach_nho_hon_k;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Khoang_cach_nho_hon_k {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
    }
}
