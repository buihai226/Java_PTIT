/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author Lenovo
 */
public class Customer extends Person{
    private int balance;

    public Customer(int balance, String name, String address) {
        super(name, address);
        this.balance = balance;
    }
    
    @Override
    
    public void display()
    {
        System.out.println("Customer name:" + getName());
        System.out.println("Customer address:" + getAddress());
        System.out.println("Customer balance:" + balance);
    }
}
