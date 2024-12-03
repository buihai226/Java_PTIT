/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javatest;

/**
 *
 * @author Lenovo
 */
public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*3.14*radius;
    }

    @Override
    public double getPerimeter() {
        return radius*6.18;
    }
    
}
