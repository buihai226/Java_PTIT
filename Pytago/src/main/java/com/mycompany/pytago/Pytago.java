/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pytago;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Pytago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            Long[] a = new Long[n];
            for(int i=0 ; i<n ; i++)
            {
                a[i] = sc.nextLong();
                a[i] = a[i] * a[i];
            }
            boolean check = false;
            Arrays.sort(a);
            for(int i=n-1 ; i >= 2 ; i--)
            {
                int l = 0;// 2 con trỏ ở phía trước i
                int r = i-1;
                while(l < r)
                {
                    if(a[l] + a[r] == a[i])
                    {
                        check = true;
                        break;
                    }
                    else if(a[l] + a[r] < a[i])
                    {
                        l++;
                    }
                    else{
                        r--;
                    } 
                }
            }
            if(check == true)
            {
                System.out.println("YES");
            }    
            else System.out.println("NO");
        }
    }
}

