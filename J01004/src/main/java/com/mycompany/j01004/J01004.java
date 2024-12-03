/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j01004;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class J01004 {

    static int check(int n)
    {
        if(n<2)
        {
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            int num = sc.nextInt();
            if(check(num) == 1)
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
