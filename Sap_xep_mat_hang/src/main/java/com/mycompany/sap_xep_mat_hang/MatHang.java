/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sap_xep_mat_hang;

/**
 *
 * @author Lenovo
 */
public class MatHang {
    private String ma;
    private String name;
    private String nhom;
    private double mua;
    private double ban;

    public MatHang(String ma, String name, String nhom, double mua, double ban) {
        this.ma = ma;
        this.name = name;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    public double lai()
    {
        return this.ban - this.mua;
    }
    public String to_String()
    {
        return String.format("%s %s %s %.2f",this.ma,this.name,this.nhom,this.lai());
    }
}
