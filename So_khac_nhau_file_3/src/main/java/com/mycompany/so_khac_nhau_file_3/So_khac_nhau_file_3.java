/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_khac_nhau_file_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class So_khac_nhau_file_3 {

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        int num[] = new int[1000];
        for (Integer i : a) {
            num[i]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (num[i] > 0) {
                System.out.println(i + " " + num[i]);
            }
        }
    }
}
