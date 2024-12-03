/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thoi_gian_online_lien_tuc;

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
public class Thoi_gian_online_lien_tuc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<User> ar = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            User us = new User(sc.nextLine(),sc.nextLine(),sc.nextLine());
            ar.add(us);
        }
        Collections.sort(ar,new Comparator<User> () {
            @Override
            public int compare(User o1, User o2) {
                if(o1.Minutes() == o2.Minutes())
                {
                    return o1.getName().compareTo(o2.getName());
                }
                return Integer.compare(o2.Minutes(), o1 .Minutes());
            }
        } );
        for(User x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
