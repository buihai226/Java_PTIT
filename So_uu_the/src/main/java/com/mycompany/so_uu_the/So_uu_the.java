/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_uu_the;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class So_uu_the {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0)
        {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            int num = c.length;
            int dem_chan = 0;
            int dem_le = 0;
            boolean check = true;//kiem tra hop le
            for(int i=0 ; i<num ; i++)
            {
                if(!Character.isDigit(c[i]))
                {
                    check = false;
                    break;
                }
                else{
                    int x = Character.getNumericValue(c[i]);
                    if(x%2 == 0)
                    {
                        dem_chan += 1;
                    }
                    else{
                        dem_le += 1;
                    }
                }
            }
            if(check == false)
            {
                System.out.println("INVALID");
            }
            else{
                if(dem_chan == dem_le)
                {
                    System.out.println("NO");
                }
                else if(num % 2 == 0){
                    if(dem_chan > dem_le)
                    {
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
                else
                {
                    if(dem_le > dem_chan)
                    {
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
