/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j01017;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class J01017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test>0)
        {
            boolean check = true;
            String s = sc.nextLine();
            int n = s.length();
            for(int i=0 ; i<n-1;i++)
            {
                int res;
                res = Math.abs((int)(s.charAt(i+1))-(int)(s.charAt(i)));
                if(res != 1)
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
            test -= 1;
        }
    }
}
