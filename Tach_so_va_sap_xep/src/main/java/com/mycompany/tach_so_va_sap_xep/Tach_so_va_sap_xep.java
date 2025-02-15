/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tach_so_va_sap_xep;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tach_so_va_sap_xep {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = sc.nextInt();
        sc.nextLine(); 
        StringBuilder sb = new StringBuilder();

        for (int l = 1; l <= n; l++) 
        {
            String s = sc.nextLine(); 
            String temp = "";
            for (int i = 0; i < s.length(); i++) 
            {
                if (Character.isDigit(s.charAt(i))) 
                {
                    temp += s.charAt(i); 
                } else 
                {
                    if (!temp.equals("")) 
                    { 
                        sb.append(temp);
                        sb.append(" ");
                        temp = ""; 
                    }
                }
            }
            if (!temp.equals("")) 
            { 
                sb.append(temp);
                sb.append(" ");
            }
        }

        ArrayList<BigInteger> arl = new ArrayList<>();
        String[] v = sb.toString().trim().split("\\s+");

        for (String i : v) 
        {
            StringBuilder x = new StringBuilder(i);
            while (x.length() > 1 && x.charAt(0) == '0') 
            {
                x.deleteCharAt(0);
            }
            arl.add(new BigInteger(x.toString())); 
        }

        Collections.sort(arl);

        for (BigInteger i : arl) 
        {
            System.out.println(i);
        }
    }
}
