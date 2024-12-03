/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thuchanh3_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class ThucHanh3_02 {

    public static void main(String[] args){
        TreeSet<Integer> se = new TreeSet<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in")))
        {
            ArrayList<String> lines = (ArrayList<String>) ois.readObject();
            
            for(String line: lines)
            {
                StringTokenizer res = new StringTokenizer(line);
                while(res.hasMoreTokens())
                {
                    String tmp = res.nextToken();
                    try{
                        int num = Integer.parseInt(tmp);
                        se.add(num);
                    }catch(NumberFormatException e){
                        
                    }
                }
            }
            for(int num: se)
            {
                System.out.println(num);
            }
            
        }catch(IOException | ClassNotFoundException e){
            
        }
    }
}
