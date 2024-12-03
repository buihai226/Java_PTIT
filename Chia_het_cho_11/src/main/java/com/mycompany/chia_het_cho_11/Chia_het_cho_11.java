/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chia_het_cho_11;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Chia_het_cho_11 {

    public static Scanner input=  new Scanner(System.in);
    public static void main(String[] args) {
        int t = input.nextInt();
        BigInteger b = new BigInteger("11");
        while (t-- > 0) {
            BigInteger a = new BigInteger(input.next());
            if (a.mod(b) == BigInteger.valueOf(0)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}
