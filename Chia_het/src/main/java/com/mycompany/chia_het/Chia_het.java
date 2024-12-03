/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chia_het;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Chia_het {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if (a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
