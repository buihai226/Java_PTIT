/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author Lenovo
 */
public class Employee extends Person{
    private int salary;

    public Employee(int salary, String name, String address) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display()
    {
        System.out.println("Employee name:" + getName());
        System.out.println("Employee address:" + getAddress());
        System.out.println("Employee salary:" + salary);
    }
}
