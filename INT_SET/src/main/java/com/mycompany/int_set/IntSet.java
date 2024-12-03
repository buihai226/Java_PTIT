/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.int_set;

import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class IntSet {
    private int[] a;
    

    public IntSet(int[] a) {
        this.a = a;
    }

    public   int[] getA() {
        return a;
    }
    

    public IntSet union(IntSet s2) {
        TreeSet<Integer> se = new TreeSet();
        for(int x : a)
        {
            se.add(x);
        }
        for(int x : s2.getA())
        {
            se.add(x);
        }
        int[] ans = new int[se.size()];
        int idx = 0;
        for(int x : se)
        {
            ans[idx] = x;
            idx++;
        }
        return new IntSet(ans);
        
    }
    
    @Override
    public String toString()
    {
        String ans = "";
        for(int x : a)
        {
            ans += String.valueOf(x) + " ";
        }
        return ans;
    }
    
}
