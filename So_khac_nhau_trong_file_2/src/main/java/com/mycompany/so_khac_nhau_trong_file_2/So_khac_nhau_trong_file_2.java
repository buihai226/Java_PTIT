/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_khac_nhau_trong_file_2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class So_khac_nhau_trong_file_2 {

    public static void main(String[] args){
        
        try{
            DataInputStream in = new DataInputStream(new FileInputStream("DATA.in"));
            int[] a = new int[1000];
            for(int i=0 ; i<100000 ; i++)
            {
                a[in.readInt()]+=1; 
            }
            for(int i=0 ; i<1000 ; i++)
            {
                if(a[i] > 0)
                {
                    System.out.println(i + " " + a[i]);
                }
            }
            
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
