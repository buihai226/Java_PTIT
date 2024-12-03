/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_con_co_tong_ngto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Day_con_co_tong_ngto {

    private static boolean OK = true;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0)
        {
            byte n = sc.nextByte();
            Byte[] A = new Byte[n];
            for(byte i=0 ; i<n ; i++)
            {
                A[i] = sc.nextByte();
            }
            Arrays.sort(A, Collections.reverseOrder());
            byte[] X = new byte[n];
            OK = true;
            Init(X,n);
            while(OK)
            {
                Result(A,X,n);
                Next_Bits_String(X,n);
            }
            test -=1;
        }
    }
    private static void Init(byte[] X, byte n)
    {
        for(byte i=0 ; i<n ; i++)
        {
            X[i] = 0;
        }
    }
    private static void Next_Bits_String(byte[] X, byte n)
    {
        byte i = (byte)(n-1);
        while(i >= 0 && X[i] == 1)
        {
            X[i] = 0;
            i--;
        }
        if(i >= 0) X[i] = 1;
        else OK = false;
    }
    private static void Result(Byte[] A,byte[] X,int n)
    {
        int sum = 0;
        for(byte i=0 ; i<n ; i++)
        {
            if(X[i] == 1)
            {
                sum += A[i];
            }
        }
        if(checkNT(sum))
        {
            for(byte i=0 ; i<n ; i++)
            {
                if(X[i] == 1)
                {
                    System.out.print(A[i]+" ");
                }
            }
            System.out.println();
        }
    }
    private static boolean checkNT(int sum) {
        if(sum < 2)
        {
            return false;
        }
        for(int i=2 ; i<sum ; i++)
        {
            if(sum % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
