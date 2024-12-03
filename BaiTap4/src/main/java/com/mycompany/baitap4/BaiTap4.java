/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BaiTap4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<BigInteger> ar = new ArrayList();
        while(n-->0)
        {
            String[] num = sc.nextLine().split("[^0-9]+");
            for(String tmp : num)
            {
                if(!tmp.isEmpty())
                {
                    ar.add(new BigInteger(tmp));
                }
            }
        }
        Collections.sort(ar);
        for(BigInteger x : ar)
        {
            System.out.println(x);
        }
    }
}
