/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.xep_hang;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Xep_hang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[1000001];
        int ans = 0;
        for(int i=0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
            b[a[i]] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0 ; i<n ; i++)
        {
            if(ans <= a[i])
            {
                ans = a[i] + b[a[i]]; // thời điểm đó + thời gian xong
            }
            else ans += b[a[i]];
        }
        System.out.println(ans);
    }
}
