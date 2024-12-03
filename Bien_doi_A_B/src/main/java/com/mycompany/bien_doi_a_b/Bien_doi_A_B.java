/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bien_doi_a_b;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Bien_doi_A_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        int i = 0; 
        while (i < s.length())
        {
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == s.charAt(i))
                j ++ ;
            a.add(s.charAt(i) - 'A');
            f.add(j - i);
            i = j;
        }
        int n = a.size();
        boolean ok = true;
        int res = 0;
        for (i = n - 1; i >= 0; -- i)
        {
            if(a.get(i) == 1 && ok)
            {
                res ++ ;
                if (f.get(i) > 1)
                {
                    ok = false; 
                }
            }
            else if (a.get(i) == 0 && !ok)
            {
                res ++ ;
                if (f.get(i) > 1)
                    ok = true;
            }
        }
        System.out.println(res);
    }
}
