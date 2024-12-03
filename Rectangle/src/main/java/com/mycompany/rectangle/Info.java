/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectangle;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Info {
    double cd;
    double cr;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        cd = sc.nextDouble();
        cr = sc.nextDouble();
    }
    void output()
    {
        double cv = (cd+cr)*2;
        double S = cd*cr;
        System.out.println(cv + " " + S);
    }
}
