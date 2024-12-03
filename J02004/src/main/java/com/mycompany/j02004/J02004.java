/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j02004;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class J02004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++)
            {
                arr[i] = sc.nextInt();
            }
            boolean check = true;
            for(int i=0 ; i< n/2 ; i++)
            {
                if(arr[i] != arr[n-i-1])
                {
                    check = false;
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
