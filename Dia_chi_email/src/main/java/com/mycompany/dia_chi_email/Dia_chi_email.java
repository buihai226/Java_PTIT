/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia_chi_email;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Dia_chi_email {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> mp = new HashMap();// lưu số lần xuất hiện
        while(test-->0)
        {
            String[] name = sc.nextLine().trim().split("\\s+");
            StringBuilder s = new StringBuilder();
            int num = name.length;
            s.append(name[num-1].toLowerCase());
            for(int i=0;i<num-1;i++)
            {
                String x = name[i];
                s.append(Character.toLowerCase(x.charAt(0)));
            }
            String ans = s.toString();
            int count;
            if (mp.containsKey(ans)) {
                count = mp.get(ans) + 1; // nếu đã tồn tại, tăng số lần xuất hiện
            } else {
                count = 1; // nếu chưa tồn tại, khởi tạo là 1
            }
             mp.put(ans, count); // cập nhật số lần xuất hiện
            String email;
            if(mp.get(ans) == 1)
            {
                email = ans + "@ptit.edu.vn";
            }
            else{
                email = ans + count + "@ptit.edu.vn";
            }
            System.out.println(email);
        }
    }
}
