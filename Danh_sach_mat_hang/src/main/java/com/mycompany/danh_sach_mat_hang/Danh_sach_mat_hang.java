/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_mat_hang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Danh_sach_mat_hang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        ArrayList<Item> ar = new ArrayList<>();
        while(test-->0)
        {
            sc.nextLine();
            String name = sc.nextLine();
            String dv = sc.nextLine();
            long buy = sc.nextInt();
            long sell = sc.nextInt();
            Item it = new Item(name,dv,buy,sell);
            ar.add(it);
        }
        Collections.sort(ar,new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2) {
                if(o1.money() == o2.money())// nếu tiền bằng nhau thì in ra theo thứ tự mã tăng dần
                {
                    if(o1.getID() > o2.getID())
                    {
                        return -1;
                    }
                    else return 1;
                }
                else {
                    return Long.compare(o2.money(),o1.money());
                }
            }
        
    });
        for(Item x : ar)
        {
            System.out.printf("%s %s %s %d %d %d",x.getmaMH(),x.getName(),x.getDv(),x.getBuy(),x.getSell(),x.money());
            System.out.println();
        }
    }
}
