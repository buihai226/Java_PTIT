/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.word_set;

import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class WordSet {
    private String str;

    public WordSet(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    

    public String union(WordSet s2) {// hop
        StringBuilder sb = new StringBuilder();
        TreeSet<String> se = new TreeSet();
        String[] str1 = this.getStr().trim().toLowerCase().split("\\s+");
        String[] str2 = s2.getStr().trim().toLowerCase().split("\\s+");
        for(String x : str1)
        {
            se.add(x);
        }
        for(String x : str2)
        {
            se.add(x);
        }
        for(String x : se)
        {
            sb.append(x).append(" ");
        }
        String ans = sb.toString();
        return ans;
    }

    public String intersection(WordSet s2) {// giao
        StringBuilder sb = new StringBuilder();
        TreeSet<String> se = new TreeSet();
        String[] str1 = this.getStr().trim().toLowerCase().split("\\s+");
        String[] str2 = s2.getStr().trim().toLowerCase().split("\\s+");
        TreeSet<String> giao = new TreeSet();
        for(String x : str1)
        {
            se.add(x);
        }
        for(String x : str2)
        {
            if(se.contains(x))
            {
                giao.add(x);
            }
        }
        for(String x : giao)
        {
            sb.append(x).append(" ");
        }
        String ans = sb.toString();
        return ans;
    }
    
}
