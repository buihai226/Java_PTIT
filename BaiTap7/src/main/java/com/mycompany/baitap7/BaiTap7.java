/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BaiTap7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        int num = s.length;
        int l = 0;
        HashSet<Integer> se = new HashSet();
        while(l<num)
        {
            if(num % 2 == 1)
            {
                if(l == num-1)
                {
                    break;
                }
            }
            int x = s[l] - '0';
            int y = s[l+1] - '0';
            int res = x*10+y;//so co 2 cs
            se.add(res);
            l += 2;
        }
        ArrayList<Integer> ar = new ArrayList(se);
        Collections.sort(ar);
        for(int x : ar)
        {
            System.out.print(x+" ");
        }
    }
}
