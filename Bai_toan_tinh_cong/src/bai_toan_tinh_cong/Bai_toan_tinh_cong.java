/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_toan_tinh_cong;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Bai_toan_tinh_cong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(); // Khởi tạo đối tượng NhanVien
        nv.nhap(sc); // Nhập dữ liệu cho nhân viên
        nv.setThuong(); // Tính thưởng
        nv.setPhucap(); // Tính phụ cấp
        nv.xuat(); // Xuất thông tin nhân viên
    }
}

