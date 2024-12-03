/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.xau_doi_xung;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Xau_doi_xung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        sc.nextLine();
        while(test-- > 0)
        {
            String s = sc.nextLine();
            int l = 0;
            int r = s.length()-1;
            int dem = 0;
            while(l<=r)
            {
                if(s.charAt(l) !=  s.charAt(r))
                {
                    dem += 1;
                }
                l++;
                r--;
            }
            if (s.length() % 2 == 1) {  // Nếu độ dài lẻ
                System.out.println(dem <= 1 ? "YES" : "NO");
            } else {  // Nếu độ dài chẵn
                System.out.println(dem == 1 ? "YES" : "NO");
            }
        }
    }
}
