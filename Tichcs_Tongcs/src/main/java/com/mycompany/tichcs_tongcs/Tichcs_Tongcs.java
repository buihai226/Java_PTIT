/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tichcs_tongcs;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tichcs_Tongcs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0)
        {
            String s = sc.nextLine();
            long tong = 0;
            long tich = 1;
            int num = s.length();
            for(int i=0 ; i<num ; i++)
            {
                int n = (int)s.charAt(i)-'0';
                if(i % 2 == 0)
                {
                    if(n == 0)
                    {
                        continue;
                    }
                    tich *= n;
                }
                else{
                    tong += n;
                }
            }
            System.out.println(tich + " " + tong);
        }
    }
}
