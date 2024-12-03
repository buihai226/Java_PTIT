/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuanhoa_hoten_1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Chuanhoa_hoten_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0)
        {
            String[] words = sc.nextLine().trim().toLowerCase().split("\\s+");
            // trim dùng để loại bỏ khoảng trắng
            StringBuilder s = new StringBuilder();
            for(String word : words)
            {
                s.append(Character.toUpperCase(word.charAt(0)));
                s.append(word.substring(1));
                s.append(" ");
            }
            System.out.println(s);
        }
        
    }
}
