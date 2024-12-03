/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j02106;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class J02106 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<3 ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int dem = 0;
        for(int i=0 ; i<n ; i++)
        {
            int dem1 = 0;
            int dem0 = 0;
            for(int j=0 ; j<3 ; j++)
            {
                if(arr[i][j] == 0)
                {
                    dem0 += 1;
                }
                else{
                    dem1 += 1;
                }
            }
            if(dem1 > dem0)
            {
                dem += 1;
            } 
        }
        System.out.print(dem);
    }
}
