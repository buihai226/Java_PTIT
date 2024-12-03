/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thoi_gian_online_lien_tuc;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Lenovo
 */
public class User {
    private String name;
    private String start;
    private String end;

    public User(String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }
    
    
    public int Minutes()
    {
        String[] tmp1 = start.split("\\s+");
        String[] date1 = tmp1[0].split("/");// ngày 1
        String[] time1 = tmp1[1].split(":");// giờ 1
        String[] tmp2 = end.split("\\s+");
        String[] date2 = tmp2[0].split("/");// ngày 2
        String[] time2 = tmp2[1].split(":");// giờ 2
        LocalDateTime time_start = LocalDateTime.of(Integer.parseInt(date1[2]) , Integer.parseInt(date1[1]) , Integer.parseInt(date1[0]),Integer.parseInt(time1[0]),Integer.parseInt(time1[1]));
        LocalDateTime time_end = LocalDateTime.of(Integer.parseInt(date2[2]) , Integer.parseInt(date2[1]) , Integer.parseInt(date2[0]),Integer.parseInt(time2[0]),Integer.parseInt(time2[1]));
        long ans = ChronoUnit.MINUTES.between(time_start,time_end);
        return (int)ans;
        
    }
    
    public String to_String()
    {
        return this.name + " " + this.Minutes();
    }
}
