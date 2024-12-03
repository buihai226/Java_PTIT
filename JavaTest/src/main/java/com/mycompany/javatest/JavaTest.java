/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javatest;

/**
 *
 * @author Lenovo
 */
public class JavaTest {

    public static void main(String[] args) {
        IShape i = new Rectangle(3,6);
        System.out.println(i.getArea());
        System.out.println(i.getPerimeter());
        i = new Circle(3.6);
        System.out.println(i.getArea());
        System.out.println(i.getPerimeter());
    }
}
