/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ds_doanh_nghiep;

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
public class DS_Doanh_Nghiep {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> ar = new ArrayList();
        for(int i=0 ; i<n ; i++)
        {
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            ar.add(x);
        }
        Collections.sort(ar,new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(DoanhNghiep x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
