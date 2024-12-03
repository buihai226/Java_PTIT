/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BaiTap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n=sc.nextInt();
            HashSet<Integer> chan1 = new HashSet();
            HashSet<Integer> le1 = new HashSet();
            for(int i=0 ; i<n ; i++)
            {
                int x = sc.nextInt();
                if(x%2==0)
                {
                    chan1.add(x);
                }
                else le1.add(x);
            }
            ArrayList<Integer> chan = new ArrayList(chan1);
            ArrayList<Integer> le = new ArrayList(le1);
            Collections.sort(chan);
            Collections.sort(le);
            int ch = chan.size();
            int l = le.size();
            for(int i=0 ; i<ch ; i++)
            {
                System.out.print(chan.get(i) +" ");
            }
            System.out.println();
            for(int i=l-1 ; i>=0 ; i--)
            {
                System.out.print(le.get(i) +" ");
            }
            System.out.println();
        }
    }
}
