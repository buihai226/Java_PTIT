/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hieu_so_nguyen_lon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Hieu_so_nguyen_lon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = new BigInteger(sc.next());
        BigInteger y = new BigInteger(sc.next());
        System.out.println(x.subtract(y));
}
}
