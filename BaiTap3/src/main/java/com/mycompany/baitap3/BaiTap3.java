/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap3;


import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class BaiTap3 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> result()
    {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=2 ; i<= 0 ; i+=2)
        {
            sinh(arr , "" , i/2);
        }
        return arr;
    }
    public static void sinh(ArrayList<String> arr,String str, int len)
    {
        String[] kt = {"4","5"};
        if(str.length() == len)
        {
            arr.add(str+new StringBuilder(str).reverse().toString());
            return;
        }
        for(String x : kt)// sinh ra cac xau 4 5
        {
            sinh(arr,str+x,len);
        }
    }

    public static void main(String[] args) {
        int test = sc.nextInt();
        ArrayList<String> ans = result();
        while(test-->0)
        {
            int n = sc.nextInt();
            for(int t=0 ; t<n ; t++)
            {
                System.out.print(ans.get(t) + " ");
            }
            System.out.println("");
        }
    }
}
