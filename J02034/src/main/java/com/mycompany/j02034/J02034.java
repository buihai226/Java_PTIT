/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j02034;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class J02034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0 ; i<n ; i++)
        {
            a.add(sc.nextInt());
        }
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i=0 ; i<m ; i++)
        {
            b.add(sc.nextInt());
        }
        Set<Integer> setA = a.stream().collect(Collectors.toSet());
        Set<Integer> setB = b.stream().collect(Collectors.toSet());
        setA.retainAll(setB); 
        TreeSet<Integer> treeSet = new TreeSet<>(setA);
        for(int i : treeSet)
        {
            System.out.print(i + " ");
        }
    }
}
