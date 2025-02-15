/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.liet_ke_va_dem;
import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.util.*;
import java.math.*;
/**
 *
 * @author Lenovo
 */
public class Liet_ke_va_dem {

   public static boolean check(String s)
    {
        char c = s.charAt(0);
        for(int i=1;i<=s.length()-1;i++)
        {
            if(c>s.charAt(i))return false;
            c = s.charAt(i);
        }
        return true;
    }
    public static class freq implements Comparable <freq>
    {
        private String x;
        private int f_x;
        public freq(String x, int f_x)
        {
            this.x = x;
            this.f_x = f_x;
        }
        public int compareTo(freq o) 
        {
            int ans = Integer.compare(o.f_x, this.f_x);
            if(ans == 0)
                return 0;
            return ans;
        }
        public String toString()
        {
            return String.format("%s %d\n",this.x, this.f_x);
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
        while(sc.hasNextLine())
        {
            String[] words = sc.nextLine().trim().split("\\s+");
            for(String i: words)
            {
                if(check(i))
                {
                    mp.put(i,mp.getOrDefault(i,0)+1);
                }
            }
        }
        ArrayList<freq> arl = new ArrayList<>();
        for(String key: mp.keySet())
        {
            arl.add(new freq(key, mp.get(key)));
        }
        Collections.sort(arl);
        for(freq i: arl)
        {
            System.out.print(i);
        }
    }
}
