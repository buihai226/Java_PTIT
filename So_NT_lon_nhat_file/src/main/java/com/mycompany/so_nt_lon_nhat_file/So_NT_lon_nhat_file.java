/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_nt_lon_nhat_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class So_NT_lon_nhat_file {
    
    public static boolean check(int n)// kiem tra nguyen to
    {
        if(n < 2)
        {
            return false;
        }
        for(int i=2 ; i<=Math.sqrt(n) ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        
        ArrayList<Integer>ar = (ArrayList<Integer>) ois.readObject(); // Input
        
        ArrayList<Integer> prime = new ArrayList<>();
        int[] f = new int[1000005];
        for (int i : ar)
            if (check(i))
            {
                if (f[i] == 0)
                    prime.add(i);
                ++f[i];
            }
        Collections.sort(prime, Collections.reverseOrder());
        for (int i = 0; i < 10; ++i)
            System.out.println(prime.get(i) + " " + f[prime.get(i)]);
    }
}
