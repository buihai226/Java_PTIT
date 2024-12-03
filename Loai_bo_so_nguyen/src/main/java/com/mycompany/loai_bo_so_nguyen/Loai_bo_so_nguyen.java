/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loai_bo_so_nguyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Loai_bo_so_nguyen {
    
    public static boolean check(String s)// tra ve true neu la int
    {
        char[] c = s.toCharArray();
        if(c.length > 9)
        {
            return false;
        }
        for(char x : c)
        {
            if(Character.isAlphabetic(x))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> ar = new ArrayList();
        while(sc.hasNextLine())
        {
            String[] str = sc.nextLine().trim().split("\\s+");
            for(String x : str)
            {
                if(check(x) == false)
                {
                    ar.add(x);
                }
            }
        }
        Collections.sort(ar);
        for(String x : ar)
        {
            System.out.print(x + " ");
        }
    }
}
