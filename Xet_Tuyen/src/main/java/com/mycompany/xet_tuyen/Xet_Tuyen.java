/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.xet_tuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Xet_Tuyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ar = new ArrayList();
        for(int i=0 ; i<n ; i++)
        {
            ThiSinh ts = new ThiSinh(i+1,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()));
            ar.add(ts);
        }
        for(ThiSinh x : ar)
        {
            System.out.println(x.to_String());
        }
    }
}
