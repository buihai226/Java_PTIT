/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_sach_mon_thi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Danh_sach_mon_thi {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> ar = new ArrayList();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0 ; i<n ; i++)
        {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String HTThi = sc.nextLine();
            MonThi s = new MonThi(ma,name,HTThi);
            ar.add(s);
        }
        Collections.sort(ar,new Comparator<MonThi>() {
            @Override
            public int compare(MonThi o1, MonThi o2) {
                return o1.getMaMH().compareTo(o.getMaMH());
            }
        } );
        for(MonThi x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
