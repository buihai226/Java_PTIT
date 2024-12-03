/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap_so_nt_file_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class Cap_so_NT_File_1 {

    public static boolean nt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args){
        ArrayList<Integer>a = null,b = null;
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
            a = (ArrayList<Integer>) input.readObject();
            input = new ObjectInputStream(new FileInputStream("DATA2.in"));
            b = (ArrayList<Integer>) input.readObject();
            input.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        TreeSet<Integer>set1 = new TreeSet<>(),set2 = new TreeSet<>(),set3 = new TreeSet<>();
        for(int x : a){
            if(nt(x)){
                set1.add(x);
                set3.add(x);
            }
        }
        for(int x : b){
            if(nt(x)){
                set2.add(x);
                set3.add(x);
            }
        }
        for(int x : set3){
            int n = x, m = 1000000 - x;
            if(set1.contains(n) && set1.contains(m) && !set2.contains(n) && !set2.contains(m) && n < m ){
                System.out.println(n + " " + m);
            }
        }
    }
}
