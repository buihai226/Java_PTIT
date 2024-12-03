/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tinhtongcaccs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tinhtongcaccs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        sc.nextLine();
        while(test-- > 0)
        {
            String s = sc.nextLine();
            int tong = 0;
            String str = "";
            for(int i=0 ; i<s.length() ; i++)
            {
                if(Character.isDigit(s.charAt(i)))
                {
                    int n = (int)(s.charAt(i) -'0');
                    tong += n;
                }
                else{
                    str += s.charAt(i);
                }
            }
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String ans = new String(a) + tong;
            System.out.println(ans);
        }
}
}
