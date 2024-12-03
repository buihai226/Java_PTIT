/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khai_bao_lop_hcn;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */


public class Khai_bao_lop_HCN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        String color = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        ans.append(Character.toUpperCase(color.charAt(1)));
        ans.append(color.substring(2).toLowerCase());
        if(cd > 0 && cr > 0)
        {
            System.out.printf("%d %d %s",cd*2+cr*2,cd*cr,ans);
        }
        else{
            System.out.print("INVALID");
        }
    }
}