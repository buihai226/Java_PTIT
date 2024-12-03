/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BaiTap8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // so luong user
        ArrayList<User> ar = new ArrayList();// lưu tk 
        for(int i=0 ; i<n ; i++)
        {
            String[] s = sc.nextLine().trim().split("\\s+");
            User us = new User(s[0],s[1]);
            ar.add(us);
        }
        int m = Integer.parseInt(sc.nextLine());;// so lan dang nhap
        HashMap<User,Integer> mp = new HashMap();// lưu số lần nhập đúng
        for(int i=0 ; i<m ; i++)
        {
            String[] s = sc.nextLine().trim().split("\\s+");
            for(User x : ar )
            {
                String x1 = x.getUsername();
                String x2 = x.getPass();
                if(x1.equals(s[0]) && x2.equals(s[1]))
                {
                    mp.put(x, mp.getOrDefault(x,0)+1);
                }
            }
        }
        for(User us : ar)
        {
            int cnt = mp.getOrDefault(us, 0);
            System.out.print(cnt+" ");
        }
    }
}
