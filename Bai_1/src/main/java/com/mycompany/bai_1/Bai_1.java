/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class Bai_1 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Phim> ar = new ArrayList();
        ArrayList<String> theloai = new ArrayList();
        for(int i=0 ; i < m ; i++)// the loai phim
        {
            theloai.add(sc.nextLine());
        }
        for(int i=0 ; i<n ; i++)
        {
            String ma = String.format("P%03d",i+1);
            String tlphim1 = sc.nextLine();// the loai o day
            String date = sc.nextLine();
            String name = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());// so tap
            int tmp = Integer.parseInt(tlphim1.substring(2)) - 1;
//            System.out.println(tmp);
            String tlphim = theloai.get(tmp);
            Phim ph = new Phim(ma,tlphim,date,name,num);
            ar.add(ph);
        }
        
        Collections.sort(ar,new Comparator<Phim>() {
            @Override
            public int compare(Phim o1, Phim o2) {
                if(o1.soNgay() == o2.soNgay())
                {
                    if(o1.getName() == o2.getName())
                    {
                        return Integer.compare(o2.getSotap(),o1.getSotap());
                    }
                    else return o1.getName().compareTo(o2.getName());
                }
                return Integer.compare(o1.soNgay(), o2.soNgay());
            }
        });
        for(Phim x : ar)
        {
            System.out.println(x.to_String());
        }
        
    }
}

//2 3
//Hai huoc
//Tinh cam
//TL001
//25/11/2021
//Phim so 1
//10
//TL001
//04/12/2021
//Phim so 2
//15
//TL002
//25/11/2021
//Phim so 3
//5
