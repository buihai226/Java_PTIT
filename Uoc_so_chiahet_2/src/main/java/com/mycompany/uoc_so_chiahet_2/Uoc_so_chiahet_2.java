/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uoc_so_chiahet_2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Uoc_so_chiahet_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            double sqr = Math.sqrt(n);
            int res = 0;
            for(int i = 1; i <= sqr; ++i)
            {
                if(n % i == 0)
                {
                    if(i % 2 == 0)
                        ++res;
                    if((n / i != i) && (n / i) % 2 ==0)
                        ++res;
                }
            }
            System.out.println(res);
        }
    }
}
