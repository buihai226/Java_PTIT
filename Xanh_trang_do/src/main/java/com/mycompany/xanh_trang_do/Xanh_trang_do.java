/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.xanh_trang_do;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Xanh_trang_do {

    public static void main(String[] args)  
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int a[]=new int[4]; //1x 2t 3d
        a[1]=0;
        a[2]=0;
        a[3]=0; 
        int x1=0,x2=0,x3=0,t1=0,t2=0,t3=0,d1=0,d2=0,d3=0;
        for(int i=0;i<n;++i)
        {
            if(s.charAt(i)=='X') a[1]++;
            else if(s.charAt(i)=='T') a[2]++;
            else a[3]++;
        }
        for(int i=0;i<a[1];++i){
            if(s.charAt(i)=='X') x1++;
            else if(s.charAt(i)=='T') t1++;
            else d1++;
        }
        for(int i=0;i<a[2];++i)
        {
            if(s.charAt(a[1]+i)=='X') x2++;
            else if(s.charAt(a[1]+i)=='T') t2++;
            else d2++;
        }
        for(int i=0;i<a[3];++i)
        {
            if(s.charAt(a[1]+a[2]+i)=='X') x3++;
            else if(s.charAt(a[1]+a[2]+i)=='T') t3++;
            else d3++;
        }
        int sum=0;
        sum+=a[1]-x1;
        if(x2<=t1)
        {
            
            t2+=x2;
            t1-=x2;
            x2=0;
            
        }else
        {
            
            x2-=t1;
            t2+=t1;
            t1=0;
        }
        if(x2<=d1)
        {
            
            d2+=x2;
            d1-=x2;
            x2=0;
            
        }else
        {
            
            x2-=d1;
            d2+=d1;
            d1=0;
        }
        if(x3<=d1)
        {
            
            d3+=x3;
            d1-=x3;
            x3=0;
            
        }
        else
        {
            
            x3-=d1;
            d3+=d1;
            d1=0;
        }
        if(x3<=t1)
        {
            
            t3+=x3;
            t1-=x3;
            x3=0;
        }
        else
        {
            
            x3-=t1;
            t3+=t1;
            t1=0;
        }
        sum+=a[2]-t2;
        System.out.print(sum);
    }
}
