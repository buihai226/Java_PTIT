/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thuchanh3_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class ThucHanh3_03 {

    public static void main(String[] args) {
        TreeSet<Integer> se = new TreeSet<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"))){
            ArrayList<Integer> ar = (ArrayList<Integer>) ois.readObject();
            
            for(int x : ar)
            {
                if(x >= 100 && check(x))
                {
                    se.add(x);
                }
            }
            
            for(int x : se)
            {
                System.out.println(x);
            }
        }catch (IOException | ClassNotFoundException e){
            
        }
    }
    
    private static boolean check(int num)
    {
        String str = Integer.toString(num);
        int len = str.length();
        for(int i=0 ; i<len/2 ; i++)
        {
            if(str.charAt(i) != str.charAt(len - i - 1))
            {
                return false;
            }
        }
        return true;
                
    }
}
