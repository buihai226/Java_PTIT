/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.giai_pt_bac_nhat;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Giai_pt_bac_nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (a == 0 && b != 0) {
            System.out.println("VN");
        } else if (a == 0 && b == 0) {
            System.out.println("VSN");
        } else {
            System.out.println(String.format("%.2f", -b / a));
        }

    }
    }

