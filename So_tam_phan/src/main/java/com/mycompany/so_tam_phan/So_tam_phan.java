/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_tam_phan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class So_tam_phan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        String line = sc.nextLine();
        while(test > 0)
        {
            String n = sc.nextLine();
            int num = n.length();
            boolean check = true;
            for(int i=0 ; i<num ; i++)
            {
                if(n.charAt(i) != '0' && n.charAt(i) != '1' && n.charAt(i) != '2')
                {
                    check = false;
                    break;
                }
            }
            if(check == true)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test -=1;
        }
    }
}
