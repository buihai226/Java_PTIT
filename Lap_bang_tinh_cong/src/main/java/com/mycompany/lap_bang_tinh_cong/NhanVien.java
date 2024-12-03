/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap_bang_tinh_cong;

/**
 *
 * @author Lenovo
 */
public class NhanVien {
    private String name;
    private long lcb;
    private int nc;// ngay cong
    private String chucvu;
    private static int stt = 0;
    private String maNV;
    
    private long thuong;
    private long phuCap;
    private long thuNhap;
    public NhanVien(String name, long lcb, int nc, String chucvu)
    {
        this.name = name;
        this.lcb = lcb;
        this.nc = nc;
        this.chucvu = chucvu;
        stt++;
        this.maNV = String.format("NV%02d",stt);
        
    }
    public String getName() {
        return name;
    }

    public long getLuongThang() {
        return lcb * nc;
    }

    public long getThuong() {
        if(nc >= 25)
        {
            return (long) (this.getLuongThang()*0.2);
        }
        else if(nc >= 22 && nc < 25)
        {
            return (long) (this.getLuongThang()*0.1);
        }
        else return 0;
    }

    public long getPhuCap() {
    switch(this.chucvu.toUpperCase()) { // chuyển hết thành chữ hoa
        case "GD":
            return 250000;
        case "PGD":
            return 200000;
        case "TP":
            return 180000;
        default:
            return 150000;
    }
}

    private long getThuNhap() {
        return this.getLuongThang() + this.getPhuCap() + this.getThuong();
    }
    
    public String toString(){
        return String.format("%s %s %d %d %d %d\n",maNV, name , getLuongThang(),getThuong(),getPhuCap(),getThuNhap());
    }
}
