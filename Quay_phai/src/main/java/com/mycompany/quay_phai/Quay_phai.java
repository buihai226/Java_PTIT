/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quay_phai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Quay_phai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++)
            {
                a[i] = sc.nextInt();
            }
            System.out.println(n-a[n-1]);
        }
    }
}
