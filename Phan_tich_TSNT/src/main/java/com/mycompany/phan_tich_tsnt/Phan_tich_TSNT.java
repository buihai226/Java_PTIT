/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phan_tich_tsnt;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Lenovo
 */
public class Phan_tich_TSNT {
    public static void Phan_tich(TreeMap<Integer,Integer> mp, int n)
    {
        for(int i=2; i<=sqrt(n) ; i++)
        {
            if(n%i == 0)
            {
                while(n%i == 0)
                {
                    if(mp.containsKey(i))
                    {
                        mp.put(i,mp.get(i)+1);
                    }
                    else{
                        mp.put(i,1);
                    }
                    n /= i;
                }
            }
        }
        if(n != 1)
        {
            mp.put(n,1);
            n /= n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        for(int t = 1; t<=test; t++)
        {
            System.out.print("Test "+ t +": ");
            int n = sc.nextInt();
            TreeMap<Integer,Integer> mp = new TreeMap<Integer,Integer>();
            Phan_tich(mp,n);
            for(Integer x : mp.keySet())
            {
                System.out.print(x + "(" + mp.get(x) + ") " );
            }
            System.out.println();
        }
    }
}
