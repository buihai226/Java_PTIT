/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BaiTap5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> ar = new ArrayList();
        double sum = 0;
        for(int i=0 ; i<n;i++)
        {
            double x = sc.nextDouble();
            ar.add(x);
        }
        double max1 = Collections.max(ar);
        double min1 = Collections.min(ar);
        int cnt = 0;
        for(double x : ar)
        {
            if(x != max1 && x != min1)
            {
                sum += x;
                cnt +=1;
            }
        }
        double ans = sum/cnt;
        System.out.printf("%.2f",ans);
        
    }
}
