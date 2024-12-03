/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;


public class Mavenproject2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cd, cr;
        cd = sc.nextInt();
        cr = sc.nextInt();
        if (cd <= 0 || cr <= 0) {
            System.out.println("0");
        } else {
            System.out.println((cd + cr) * 2 + " " + cd * cr);
        }
    }
}
