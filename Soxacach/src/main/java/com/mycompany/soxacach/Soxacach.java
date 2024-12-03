/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soxacach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Soxacach {
    
    public static void backtrack(int n,int[] a, ArrayList<Integer> num,ArrayList<Integer> ar)
    {
        if(num.size() == n)
        {
            int res = 0;
            for(int x : num)
            {
                res = res*10 + x;
            }
            ar.add(res);
            return;
        }
        
        for(int j=1 ; j<=n ; j++)// kiem tra chu so
        {
            if(a[j] == 1 && (num.isEmpty()|| Math.abs((num.get(num.size()-1)) -j) != 1))
            {
                num.add(j);
                a[j] = 0;
                backtrack(n,a,num,ar);
                a[j] = 1;// ký tự lại được sử dụng
                num.remove(num.size() - 1);// trả lại ký tự
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            ArrayList<Integer> ar = new ArrayList();// Mang luu ket qua
            int n = sc.nextInt();
            int[] a = new int[10];
            for(int i=1 ; i<=n ; i++)
            {
                a[i] = 1;
            }
            ArrayList<Integer> num = new ArrayList();
            backtrack(n,a,num,ar);
            Collections.sort(ar);
            for(int x : ar)
            {
                System.out.println(x);
            }
        }
        
    }
}
