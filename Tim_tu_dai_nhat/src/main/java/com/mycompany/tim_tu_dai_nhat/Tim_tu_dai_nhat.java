/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tim_tu_dai_nhat;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tim_tu_dai_nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans_num = 0;
        String ans_str = "";
        while(sc.hasNextLine())
        {
            String[] line = sc.nextLine().trim().split("\\s");
            for(String str : line)
            {
                if(ans_num < str.length())
                {
                    ans_num = str.length();
                    ans_str = str;
                }
            }
        }
        System.out.print(ans_str + " - " + ans_num);
        
    }
}
