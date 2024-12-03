/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uoc_nt_lon_nhat;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class Uoc_nt_lon_nhat {
    public static int Uoc(int n){
        TreeSet<Integer> se = new TreeSet<Integer>();
        for(int i=2 ; i<=sqrt(n);i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    se.add(i);
                    n /= i;
                }
            }
        }
        if(n != 1)
        {
            se.add(n);
            n /= n;
        }
        int num = se.size();
        return se.last();
        
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        while(test > 0)
        {
            int n = sc.nextInt();
            int res = Uoc(n);
            System.out.println(res);
            test -= 1;
        }
    }
}
