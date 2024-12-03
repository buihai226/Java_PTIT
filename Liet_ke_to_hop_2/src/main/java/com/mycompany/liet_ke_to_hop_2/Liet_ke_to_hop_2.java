/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.liet_ke_to_hop_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Liet_ke_to_hop_2 {
    static int n,k;
    static int cnt = 0;
    public static void Try(int i, ArrayList<Integer> num)
    {
        if(num.size() == k)
        {
            for(int x : num)
            {
                System.out.print(x);
            }
            System.out.print(" ");
            cnt += 1;
            return;
        }
        for(int j=i ; j<=n ; j++)
        {
            num.add(j);
            Try(j+1,num);
            num.remove(num.size()-1);// hàm remove xét theo index
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        ArrayList<Integer> num = new ArrayList();
        Try(1,num);
        System.out.println();
        System.out.print("Tong cong co " + cnt + " to hop");
    }
}
