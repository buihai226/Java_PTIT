/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tinh_so_fibo;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tinh_so_fibo {
    public static void fibo(long[] a)
    {
        a[1] = 1;
        a[2] = 1;
        for(int i=3 ; i<93; i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        long[] a1 = new long[93];
        fibo(a1);
        while(test > 0)
        {
            int n = sc.nextInt();
            boolean check = false;
            for(long x : a1)
            {
                if(x == n)
                {
                    check = true;
                    break;
                }
            }
            if(check == true)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test -= 1;
        }
    }
}
