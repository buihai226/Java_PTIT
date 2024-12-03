/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phan_so;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Phan_so {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Ps phanso = new Ps(a,b);
        phanso.solve();
    }
}
