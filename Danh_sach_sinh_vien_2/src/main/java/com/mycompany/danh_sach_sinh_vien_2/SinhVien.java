/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danh_sach_sinh_vien_2;

/**
 *
 * @author Lenovo
 */
public class SinhVien {
    private String name;
    private String lop;
    private String date; // chua chuan hoa
    private double gpa;
    private String msv;

    public SinhVien(String name, String lop, String date, double gpa , int id) {
        this.name = setName(name);
        this.lop = lop;
        this.date = setDate(date);
        this.gpa = gpa;
        this.msv = String.format("B20DCCN%03d", id);
    }

    public String setName(String name) {
        String[] s = name.trim().toLowerCase().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (String x : s) {
            if (!x.isEmpty()) {
                ans.append(Character.toUpperCase(x.charAt(0)));
                ans.append(x.substring(1)).append(" ");
            }
        }
        return ans.toString().trim();
    }

    public String setDate(String date) {
        String[] s = date.split("/");
        StringBuilder ans = new StringBuilder();
        for (String x : s) {
            if (x.length() < 2) {
                ans.append("0").append(x).append("/");
            } else {
                ans.append(x).append("/");
            }
        }
        // Xóa ký tự "/" cuối cùng
        if (ans.length() > 0) {
            ans.setLength(ans.length() - 1);
        }
        return ans.toString();
    }
    
    public String toString()
    {
        return String.format("%s %s %s %s %.2f",this.msv,this.name,this.lop,this.date,this.gpa );
    }
    
}
