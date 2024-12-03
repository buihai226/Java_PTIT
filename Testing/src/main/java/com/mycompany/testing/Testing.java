/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testing;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Testing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = sc.nextLine().split(" ");
        for(String x : name)
        {
            System.out.println(x);
        }
    }
}
