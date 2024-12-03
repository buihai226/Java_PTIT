/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tap_tu_rieng_2xau;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tap_tu_rieng_2xau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        sc.nextLine();
        for(int t=0 ; t<test ; t++)
        {
            String[] s1 = sc.nextLine().split("\\s+");
            String s2 = sc.nextLine();
            HashSet<String> se = new HashSet<String>();
            for(String x : s1)
            {
                if(!s2.contains(x))
                {
                    se.add(x);
                }
            }
            for(String x : se)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
