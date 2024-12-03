/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai_2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Bai_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String,Integer> mp = new LinkedHashMap();
        ArrayList<User> ar = new ArrayList();// luu nguoi dung
        for(int i=0 ; i<n ; i++)
        {
            String[] str = sc.nextLine().split("\\s+");
            String dangnhap = str[0];
            String matkhau = str[1];
            User us = new User(dangnhap,matkhau);
            ar.add(us);
            mp.put(dangnhap,0);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<m ; i++)
        {
            String[] str = sc.nextLine().split("\\s+");
            String dangnhap = str[0];
            String matkhau = str[1];
            User user = new User(dangnhap,matkhau);
            if(mp.containsKey(dangnhap))
            {
                if(matkhau.equals(user.getMatkhau()))
                {
                    mp.put(dangnhap,mp.getOrDefault(dangnhap,0) + 1) ;
                }
            }
        }
        for(String x : mp.keySet())
        {
            System.out.print(mp.get(x) + " ");
        }
        
    }
}


//4
//tendangnhap matkhau
//username password
//nguoidung m4tkh4un4yr4tb40m4t
//user2 password
//6
//tendangnhap matkhau
//username matkhau
//bfc34 contest
//username password
//tendangnhap matkhau
//user2 password