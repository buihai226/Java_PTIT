/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sap_xep_doi_tuong_nhan_vien;

/**
 *
 * @author Lenovo
 */
public class NhanVien {
    private String name;
    private String gen;
    private String date;
    private String address;
    private String mst;
    private String date_hd;
    private String mnv;

    public NhanVien(String mnv,String name, String gen, String date, String address, String mst, String date_hd) {
        this.name = name;
        this.gen = gen;
        this.date = date;
        this.address = address;
        this.mst = mst;
        this.date_hd = date_hd;
        this.mnv = mnv;
    }

    public String getDate() {
        return date;
    }
    
    
    public String to_String(){
        return String.format("%s %s %s %s %s %s %s",this.mnv,this.name,this.gen,this.date,this.address,this.mst,this.date_hd);
    }
}
