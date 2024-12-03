/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinh_tien_phong;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Lenovo
 */
public class KhachHang {
    private String name;
    private String sophong;
    private String start;
    private String end;
    private int bonus;
    private String ma;

    public KhachHang( String ma, String name, String sophong, String start, String end, int bonus) {
        this.name = setName(name);
        this.sophong = sophong.trim();
        this.start = start;
        this.end = end;
        this.bonus = bonus;
        this.ma = ma;
    }

    public String setName(String name) {
        StringBuilder sb = new StringBuilder();
        String[] str = name.trim().split("\\s+");
        for(String s : str)
        {
            sb.append(s.substring(0,1).toUpperCase()).append(s.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    
    public int songay()// so ngay trong khach san
    {
        String[] str1 = start.trim().split("/");
        String[] str2 = end.trim().split("/");
        LocalDate st = LocalDate.of(Integer.parseInt(str1[2]),Integer.parseInt(str1[1]),Integer.parseInt(str1[0]));
        LocalDate en = LocalDate.of(Integer.parseInt(str2[2]),Integer.parseInt(str2[1]),Integer.parseInt(str2[0]));
        int ans = (int) ChronoUnit.DAYS.between(st, en);
        return ans+1;
    }
    
    public int Overall()// tra ve tong tien
    {
        int sum = 0;
        char tang = this.sophong.charAt(0);
        if(tang == '1')// tang 1
        {
            sum = this.songay()*25 + bonus;
        }
        else if(tang == '2')// tang 2
        {
            sum = this.songay()*34 + bonus;
        }
        else if(tang == '3')// tang 3
        {
            sum = this.songay()*50 + bonus;
        }
        else if(tang == '4')// tang 4
        {
            sum = this.songay()*80 + bonus;
        }
        return sum;
    }
    
    public String to_String()
    {
        return String.format("%s %s %s %d %d",this.ma,this.name,this.sophong,this.songay(),this.Overall());
    }
    
}
