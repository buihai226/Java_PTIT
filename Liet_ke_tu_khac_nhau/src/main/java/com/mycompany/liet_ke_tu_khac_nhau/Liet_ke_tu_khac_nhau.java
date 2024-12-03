/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.liet_ke_tu_khac_nhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Liet_ke_tu_khac_nhau {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file);
        ArrayList<String> ar = new ArrayList<>();
        try{
            while(sc.hasNextLine())
        {
            String[] lines = sc.nextLine().trim().split("\\s+");
            for(String word : lines)
            {
                if(!ar.contains(word.toLowerCase()))
                {
                    ar.add(word.toLowerCase());
                }
            }
        }
        }catch(Exception e){
            
        }
        Collections.sort(ar);
        for(String x : ar)
        {
            System.out.println(x);
        }
    }
}
