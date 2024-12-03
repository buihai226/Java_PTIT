/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hinh_vuong;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Hinh_Vuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, mina = Integer.MAX_VALUE, maxa = Integer.MIN_VALUE, minb = Integer.MAX_VALUE, maxb = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            mina = Math.min(a, mina);
            maxa = Math.max(a, maxa);
            minb = Math.min(b, minb);
            maxb = Math.max(b, maxb);
        }
        int res = Math.max((maxa - mina), (maxb - minb));
        System.out.println(res * res);
    }
}
