/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iemployee;

/**
 *
 * @author Lenovo
 */
public class Employee implements IEmployee{
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int calculateSalary() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    
}
