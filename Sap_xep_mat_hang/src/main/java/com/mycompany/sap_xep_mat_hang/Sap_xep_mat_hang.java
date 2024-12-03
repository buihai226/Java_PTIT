/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sap_xep_mat_hang;

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
public class Sap_xep_mat_hang {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ar = new ArrayList();
        for(int i=0 ; i<n ; i++)
        {
            String ma = String.format("MH%02d", i+1);
            MatHang mh = new MatHang(ma,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            ar.add(mh);
        }
        Collections.sort(ar,new Comparator<MatHang> () {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return Double.compare(o2.lai(),o1.lai());
            }
        });
        for(MatHang x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
