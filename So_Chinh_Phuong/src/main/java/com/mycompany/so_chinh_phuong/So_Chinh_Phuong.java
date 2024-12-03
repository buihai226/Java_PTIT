/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_chinh_phuong;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class So_Chinh_Phuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0 ; t<test ; t++)
        {
            int n = sc.nextInt();
            int res = (int)sqrt(n);
            if(res * res == n)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
