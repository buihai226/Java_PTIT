/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Comparator;

/**
 *
 * @author Lenovo
 */
public class SortbyName implements Comparator<SinhVien> {

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }
    
}
