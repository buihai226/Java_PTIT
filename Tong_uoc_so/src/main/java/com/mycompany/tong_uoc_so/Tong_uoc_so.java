/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tong_uoc_so;


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tong_uoc_so {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prime = new int[2000001];
        prime[0] = prime[1] = 0;
        for(int i=2 ; i<2000001 ; i++)
        {
            prime[i] = 1;
        }
        for(int i=2 ; i*i<2000001 ; i++)
        {
            if(prime[i] == 1)
            {
                for(int j=i*i ; j<2000001 ; j+=i)
                {
                    prime[j] = 0;
                }
            }
        }
        int[] sumDiv = new int[2000001]; // tong uoc cua tung so
        for(int i=2 ; i<2000001 ; i++)
        {
            if(prime[i] == 1)// neu i nguyen to
            {
                for(int j = i ; j<2000001 ; j+=i)// kiem tra tung boi cua i
                {
                    int tmp = j;
                    while(tmp % i == 0)
                    {
                        sumDiv[j] += i;// cộng số lần xuất hiện của i vào số đó, cộng dần
                        tmp /= i;
                    }
                }
            }
        }
        int test = sc.nextInt();
        long ans = 0;  
        for(int t=1 ; t<=test ; t++)
        {
            int n = sc.nextInt();
            ans += sumDiv[n];
        }
        System.out.print(ans);
    }
}
