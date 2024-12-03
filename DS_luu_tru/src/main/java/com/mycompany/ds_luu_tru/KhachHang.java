/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds_luu_tru;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Lenovo
 */
public class KhachHang {
    private String makh;
    private String name;
    private String maphong;
    private String daycome;
    private String dayout;

    public KhachHang(String makh, String name, String maphong, String daycome, String dayout) {
        this.makh = makh;
        this.name = name;
        this.maphong = maphong;
        this.daycome = daycome;
        this.dayout = dayout;
    }
    public int getDay()
    {
        if(this.daycome.equals(this.dayout))
        {
            return 0;
        }
        String[] come = this.daycome.split("/");
        String[] out = this.dayout.split("/");
        //trả về số ngày
        LocalDate start = LocalDate.of(Integer.parseInt(come[2]), Integer.parseInt(come[1]), Integer.parseInt(come[0]));
        LocalDate end = LocalDate.of(Integer.parseInt(out[2]), Integer.parseInt(out[1]), Integer.parseInt(out[0]));
        int ans = (int)ChronoUnit.DAYS.between(start, end);
        return ans; // trả về số ngày
    }
    
    public String to_String()
    {
        return String.format("%s %s %s %d",this.makh,this.name,this.maphong,this.getDay());
    }
}
