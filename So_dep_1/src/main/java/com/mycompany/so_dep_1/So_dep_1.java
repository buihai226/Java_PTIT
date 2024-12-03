/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.so_dep_1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class So_dep_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextByte();
        sc.nextLine();
        while(test-- > 0)
        {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            boolean check1 = true;// kiem tra chan le
            boolean check2 = true;// kiem tra thuan nghich
            boolean checknt = true;
            int l = 0;
            int r = c.length - 1;
            for(int i=0 ; i<=r ; i++)
            {
                if(c[i] != '2' && c[i] != '3' && c[i] != '5' && c[i] != '7')
                {
                    checknt = false;
                    break;
                }
            }
            if(checknt == false)
            {
                System.out.println("NO");
                continue;
            }
            while(l<r)
            {
                if(c[l] != c[r])
                {
                    check2 = false;
                    break;
                }
                l++;
                r--;
            }
            if(check2 == true)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
