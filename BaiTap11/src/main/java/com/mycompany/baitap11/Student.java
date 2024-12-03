/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap11;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String name;
    private String start;
    private String end;
    private long time;
    public Student(String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
        thoigian();
    }

    public String getName() {
        return name;
    }


    
    
    public void thoigian()
    {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date st = sdf.parse(start);
            Date en = sdf.parse(end);
            this.time = (en.getTime() - st.getTime()) /(1000*60);
        }catch(Exception e)
        {
            e.printStackTrace();
            this.time = 0;
        }
    }
    public long getTime()
    {
        return time;
    }
}
