/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thuchanh3_04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class ThucHanh3_04 {

    public static void main(String[] args) {
        HashSet<String> str = new HashSet();
        HashSet<Integer> in = new HashSet();
        TreeSet<String> se = new TreeSet();
        
        try(ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"))){
            ArrayList<String> str1 = (ArrayList<String>) ois1.readObject();
            str.addAll(str1);
        }catch (IOException | ClassNotFoundException e){
            return;
        }
        
        try(ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"))){
            ArrayList<Integer> in1 = (ArrayList<Integer>) ois2.readObject();
            in.addAll(in1);
        }catch (IOException | ClassNotFoundException e){
            return;
        }
        
        for(String s : str)
        {
            if(s.length() != 5) continue;
            for(int num : in)
            {
                if(num < 100 || num > 999) continue;
                String formattedNum = String.format("%03d",num);
                se.add(s+formattedNum);
            }
        }
        for(String tmp : se)
        {
            System.out.println(tmp);
        }
    }
}
