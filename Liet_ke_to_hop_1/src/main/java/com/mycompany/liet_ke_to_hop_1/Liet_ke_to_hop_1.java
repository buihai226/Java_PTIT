/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.liet_ke_to_hop_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Liet_ke_to_hop_1 {
     private static int cnt = 0;// dem so luong to hop
     
    private static void sinh(int n, int k, ArrayList<Integer> num, int i)
    {
        if(num.size() == k)
        {
            for(int x : num)
            {
                System.out.print(x + " ");
            }
            System.out.println();
            cnt += 1;
            return;
        }
        
        for(int j=i ; j<=n ; j++)// tăng dần
        {
            num.add(j);
            sinh(n,k,num,j+1);
            num.remove(num.size() - 1);// bỏ phần tử cuối cùng
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> num = new ArrayList();
        sinh(n,k,num,1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
