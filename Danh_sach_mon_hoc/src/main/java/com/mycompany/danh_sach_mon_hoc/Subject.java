/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_mon_hoc;

/**
 *
 * @author Lenovo
 */
public class Subject {
    private String ma;
    private String name;
    private int tc;

    public Subject(String ma, String name, int tc) {
        this.ma = ma;
        this.name = name;
        this.tc = tc;
    }
    public String toString()
    {
        return ma + " " + name + " " + tc;
    }

    public String getName() {
        return name;
    }
    
    
           
}
