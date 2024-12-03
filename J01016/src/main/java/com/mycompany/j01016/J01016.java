/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j01016;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class J01016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        int num = s.length();
        int dem = 0;
        for(int i=0 ; i<num ; i++)
        {
            if(s.charAt(i)=='4'|| s.charAt(i) == '7')
            {
                dem +=1;
            }
        }
        if(dem==4 || dem == 7)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
