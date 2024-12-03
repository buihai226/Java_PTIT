/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boi_so_nho_nhat;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Boi_so_nho_nhat {
    // Hàm tính LCM của hai số sử dụng GCD
    public static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(a.gcd(b));
    }

    // Hàm tính LCM của tất cả các số từ 1 đến n
    public static BigInteger lcmOfFirstN(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = lcm(result, BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Số lượng test case
        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(lcmOfFirstN(n));  // In ra LCM của các số từ 1 đến n
        }
    }
}
