/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tangdan_giamdan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class Tangdan_Giamdan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            Set<Integer> se = new HashSet();
            ArrayList<Integer> chan = new ArrayList();
            ArrayList<Integer> le = new ArrayList();
            for(int i=0 ; i<n ; i++)
            {
                a[i] = sc.nextInt();
                if(se.add(a[i]))
                {
                    if(a[i] % 2 == 0)
                    {
                        chan.add(a[i]);
                    }
                    else{
                        le.add(a[i]);
                    }
                }
            }
            Collections.sort(chan);
            Collections.sort(le,Comparator.reverseOrder());
            for(int x : chan)
            {
                System.out.print(x + " ");
            }
            System.out.println();
            for(int x : le)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
