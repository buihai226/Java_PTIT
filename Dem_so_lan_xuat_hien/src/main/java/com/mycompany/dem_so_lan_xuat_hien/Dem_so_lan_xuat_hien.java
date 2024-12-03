/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dem_so_lan_xuat_hien;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Dem_so_lan_xuat_hien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        for(int t = 1; t<=test ; t++)
        {
            System.out.println("Test " + t + ":");
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++)
            {
                a[i] = sc.nextInt();
            }
            LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<Integer,Integer>();
            for(int i=0 ; i<n ; i++)
            {
                if(mp.containsKey(a[i]))
                {
                    mp.put(a[i],mp.get(a[i])+1);
                }
                else{
                    mp.put(a[i],1);
                }
            }
            for(int x : mp.keySet())
            {
                System.out.println(x + " xuat hien " + mp.get(x) + " lan");
            }
        }
    }
}
