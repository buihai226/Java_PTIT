/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BaiTap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-->0)
        {
            long min = 9;
            long max = 0;
            long num = sc.nextLong();
            while(num>0)
            {
                long t = num%10;
                if(t >= max)
                {
                    max = t;
                }
                if(t <= min)
                {
                    min = t;
                }
                num /=10;
            }
            System.out.println(max+" "+min);
        }
    }
}
