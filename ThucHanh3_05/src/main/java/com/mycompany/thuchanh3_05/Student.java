/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh3_05;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String msv;
    private String name;
    private String lop;
    private String sdt;
    private String email;

    public Student(String msv, String name, String lop,String email, String sdt) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        setSdt(sdt);
    }

    public void setSdt(String sdt) {
        this.sdt = String.format("0"+sdt);
    }

    public String getMsv() {
        return msv;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public String getSdt() {
        return sdt;
    }
    
    
//    public String email()// tra ve email
//    {
//        
//        String[] s = this.name.trim().split("\\s+");
//        StringBuilder sb = new StringBuilder();
//        sb.append(s[2].toLowerCase());
//        sb.append(s[0].substring(0,1).toLowerCase());
//        sb.append(s[1].substring(0,1).toLowerCase());
//        sb.append("@gmail.com");
//        return sb.toString();
//    }
    
    public String toString()
    {
        return String.format("%s %s %s %s %s",this.getMsv(),this.getName(),this.getLop(),this.getEmail(),this.getSdt());
    }
    
}
