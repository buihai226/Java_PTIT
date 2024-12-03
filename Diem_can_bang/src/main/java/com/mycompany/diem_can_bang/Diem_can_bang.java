/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diem_can_bang;


import java.util.Scanner;

public class Diem_can_bang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++)
            {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n]; // mảng lưu tổng từ 0 đến i
            b[0] = a[0];
            for(int i=1 ; i<n ; i++)
            {
                b[i] = b[i-1] + a[i]; // tổng từ 0 -> i 
            }
            boolean check = false;
            for(int i=1 ; i<n ; i++)
            {
                if(b[i-1] == b[n-1] - b[i]) // tổng từ 0->i = i+1 -> cuối
                {
                    check = true;
                    System.out.println(i+1);// điểm cân bằng ĐẦU TIÊN
                    break;
                }
            }
            if(check == false)
            {
                System.out.println("-1");
            }
        }
    }
}
