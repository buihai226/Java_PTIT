/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lop_pair;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Lop_Pair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
