/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boisochungnhonhat;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt(); // Đọc số bộ test
        sc.nextLine(); // Chuyển dòng

        for (int i = 0; i < testCount; i++) {
            String num1 = sc.nextLine().trim(); // Đọc số đầu tiên
            String num2 = sc.nextLine().trim(); // Đọc số thứ hai

            // Chuyển đổi chuỗi thành BigInteger
            BigInteger a = new BigInteger(num1);
            BigInteger b = new BigInteger(num2);

            // Tính GCD
            BigInteger gcd = a.gcd(b);

            // Tính LCM
            BigInteger lcm = a.multiply(b).divide(gcd);

            // In kết quả
            System.out.println(lcm);
        }
        sc.close(); // Đóng Scanner
    }
}
