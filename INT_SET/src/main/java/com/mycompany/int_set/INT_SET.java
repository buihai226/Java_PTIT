/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.int_set;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class INT_SET {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
