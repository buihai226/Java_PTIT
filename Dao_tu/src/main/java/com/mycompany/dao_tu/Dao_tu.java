/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dao_tu;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Dao_tu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0)
        {
            String[] words = sc.nextLine().trim().split("\\s+");
            StringBuilder s = new StringBuilder();
            for(String word : words)
            {
                StringBuilder rev = new StringBuilder(word);
                s.append(rev.reverse());
                s.append(" ");
            }
            System.out.println(s);
        }
    }
}
