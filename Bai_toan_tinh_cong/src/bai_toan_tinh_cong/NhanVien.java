/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_toan_tinh_cong;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class NhanVien {
    private String name;
    private long luongcb;
    private long ngaycong;
    private String chucvu;
    private long thuong;
    private long phucap;
    private long luongthang;
    private long thunhap;

    public NhanVien() {
    }

    // Phương thức nhập dữ liệu cho nhân viên
    public void nhap(Scanner sc) {
        name = sc.nextLine();
        luongcb = sc.nextLong();
        ngaycong = sc.nextLong();
        sc.nextLine();
        chucvu = sc.nextLine();
    }

    // Phương thức tính thưởng dựa trên số ngày công
    public void setThuong() {
        if (ngaycong >= 25) {
            thuong = Math.round(20.0 / 100 * ngaycong * luongcb);
        } else if (ngaycong >= 22 && ngaycong < 25) {
            thuong = Math.round(10.0 / 100 * ngaycong * luongcb);
        } else {
            thuong = 0;
        }
    }

    // Phương thức tính phụ cấp dựa trên chức vụ
    public void setPhucap() {
        if (chucvu.equals("GD")) {
            phucap = 250000;
        } else if (chucvu.equals("PGD")) {
            phucap = 200000;
        } else if (chucvu.equals("TP")) {
            phucap = 180000;
        } else {
            phucap = 150000;
        }
    }

    // Phương thức xuất thông tin nhân viên
    public void xuat() {
        luongthang = ngaycong * luongcb;
        thunhap = luongthang + thuong + phucap;
        System.out.println("NV01 " + name + " " + luongthang + " " + thuong + " " + phucap + " " + thunhap);
    }    
}
