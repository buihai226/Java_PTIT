/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_nt_file_nhi_phan;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class So_NT_File_Nhi_Phan {
    public static boolean check(int n)
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

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Integer,Integer> mp = new HashMap();
        ArrayList<Integer> ar = new ArrayList();// lưu các snt
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
            ArrayList<Integer> arr =  (ArrayList<Integer>) ois.readObject();
            for(int x : arr)
            {
                if(mp.containsKey(x))
                {
                    mp.put(x, mp.get(x) + 1);
                }
                else if(check(x)) {
                    ar.add(x);
                    mp.put(x,1);
                }
            }
            
            Collections.sort(ar);
            for(int x : ar)
            {
                System.out.println(x+ " " + mp.get(x));
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(So_NT_File_Nhi_Phan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(So_NT_File_Nhi_Phan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
