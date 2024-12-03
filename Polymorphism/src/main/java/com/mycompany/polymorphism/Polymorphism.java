/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */




public class Polymorphism {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Employee(4000,"Huy","Thanh Hoa");
        p.display();
        p = new Customer(8000,"Huy Do Thai" , "Thanh Hoa version 2");
        p.display();
    }
}
