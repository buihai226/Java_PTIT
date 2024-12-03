/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ds_luu_tru;

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
public class DS_luu_tru {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ar = new ArrayList();
        for(int i=0 ; i<n ; i++)
        {
            String makh = String.format("KH%02d",i+1);
            KhachHang kh = new KhachHang(makh,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ar.add(kh);
        }
        Collections.sort(ar,new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return Integer.compare(o2.getDay(),o1.getDay());
            }
        });
        for(KhachHang x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
