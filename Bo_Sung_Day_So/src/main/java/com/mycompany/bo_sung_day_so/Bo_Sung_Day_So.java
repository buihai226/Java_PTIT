/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bo_sung_day_so;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Bo_Sung_Day_So {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // so con so duoc dem
        sc.nextLine();
        ArrayList<Integer> ar = new ArrayList();
        while(n>0)
        {
            String[] s = sc.nextLine().trim().split("\\s+");
            for(String x : s)
            {
                int num = Integer.valueOf(x);
                ar.add(num);
                n -= 1;
            }
        }
        boolean check = true;
        int end = Collections.max(ar);
        if(ar.size() == end )
        {
            System.out.print("Excellent!");
        }
        else{
            for(int i=1 ; i<=end ; i++)
            {
                if(ar.contains(i))
                {
                    continue;
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
}
