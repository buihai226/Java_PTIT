/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_tn_trong_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class So_TN_trong_File {
    public static boolean check(int n){// check thuan nghich
        String s = Integer.toString(n);
        if (s.length() == 1 || s.length() % 2 == 0)
            return false;
        for (int i = 0; i <= s.length() / 2; ++i)
        {
            if (s.charAt(i) % 2 == 0)
                return false;
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
        
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) sc2.readObject();
        ArrayList<Integer> num = new ArrayList<>();
        Set<Integer> set1 = new TreeSet<>(a);
        Set<Integer> set2 = new TreeSet<>(b);
        for (int i : set1)
        {
            if (set2.contains(i) && check(i))
                num.add(i);
            if (num.size() == 10)
                break;
        }
        for (int i : num)
            System.out.println(i + " " + (Collections.frequency(a, i) + Collections.frequency(b, i)));
    }
}
