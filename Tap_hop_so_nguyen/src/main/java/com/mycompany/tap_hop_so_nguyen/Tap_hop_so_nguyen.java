/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tap_hop_so_nguyen;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class Tap_hop_so_nguyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> se1 =  new TreeSet<Integer> ();
        Set<Integer> se2 =  new TreeSet<Integer> ();
        for(int i=0 ; i<n ; i++)
        {
            se1.add(sc.nextInt());
        }
        for(int i=0 ; i<m ; i++)
        {
            se2.add(sc.nextInt());
        } 
        Set<Integer> giao = new TreeSet<Integer>(se1);
        giao.retainAll(se2);
        for(int x : giao)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        Set<Integer> ans1 = new TreeSet<Integer> (se1);
        ans1.removeAll(se2);
        for(int x : ans1)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        Set<Integer> ans2 = new TreeSet<Integer> (se2);
        ans2.removeAll(se1);
        for(int x : ans2)
        {
            System.out.print(x+" ");
        }
        
    }
}
