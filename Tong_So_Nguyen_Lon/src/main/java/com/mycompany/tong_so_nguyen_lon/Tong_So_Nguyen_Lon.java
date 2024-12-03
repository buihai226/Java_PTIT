/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tong_so_nguyen_lon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tong_So_Nguyen_Lon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 
        
        // Duyệt qua từng test case
        for (int i = 0; i < T; i++) {
            // Đọc chuỗi X và Y
            String X = sc.nextLine();
            String Y = sc.nextLine();
            
            BigInteger numX = new BigInteger(X);
            BigInteger numY = new BigInteger(Y);
            
            BigInteger sum = numX.add(numY);
            
            // In kết quả
            System.out.println(sum);
    }
}
}
