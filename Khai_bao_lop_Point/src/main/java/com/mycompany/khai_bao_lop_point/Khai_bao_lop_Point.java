/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khai_bao_lop_point;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Khai_bao_lop_Point {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            System.out.printf("%.4f",p1.distance(p2));
            System.out.println();
        }
    }
}
