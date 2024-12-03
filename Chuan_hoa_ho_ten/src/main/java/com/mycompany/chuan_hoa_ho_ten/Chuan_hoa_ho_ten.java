/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuan_hoa_ho_ten;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Chuan_hoa_ho_ten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0)
        {
            String[] words = sc.nextLine().trim().toLowerCase().split("\\s+");
            // trim dùng để loại bỏ khoảng trắng
            StringBuilder s = new StringBuilder();// luu ket qua
            int num = words.length;
            for(int i=1 ; i<num ; i++)
            {
                String word = words[i];
                s.append(Character.toUpperCase(word.charAt(0)));
                s.append(word.substring(1));
                if(i<num-1)
                {
                    s.append(" ");
                }
                else{
                    s.append(", ");
                }
            }
            // Họ
            String ho = "";
            for(char x : words[0].toCharArray())
            {
                ho += Character.toUpperCase(x);
            }
            s.append(ho);
            
            System.out.println(s);
        }
        
    }
}
