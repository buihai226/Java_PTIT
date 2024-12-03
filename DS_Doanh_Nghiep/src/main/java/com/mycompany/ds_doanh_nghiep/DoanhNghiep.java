/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds_doanh_nghiep;

/**
 *
 * @author Lenovo
 */
public class DoanhNghiep {
    private String ma;
    private String name;
    private int num;

    public DoanhNghiep(String ma, String name, int num) {
        this.ma = ma;
        this.name = name;
        this.num = num;
    }

    public String getMa() {
        return ma;
    }
    public String to_String(){
        return String.format("%s %s %s",this.ma,this.name,this.num);
    }
}
