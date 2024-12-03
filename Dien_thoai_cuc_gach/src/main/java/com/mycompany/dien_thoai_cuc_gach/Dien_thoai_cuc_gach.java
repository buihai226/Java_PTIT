/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dien_thoai_cuc_gach;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Dien_thoai_cuc_gach {

    public static char getNum(char c) {
        switch(c) {
            case 'A': case 'B': case 'C': 
            case 'a': case 'b': case 'c':
                return '2';
            case 'D': case 'E': case 'F': 
            case 'd': case 'e': case 'f':
                return '3';
            case 'G': case 'H': case 'I': 
            case 'g': case 'h': case 'i':
                return '4';
            case 'J': case 'K': case 'L': 
            case 'j': case 'k': case 'l':
                return '5';
            case 'M': case 'N': case 'O': 
            case 'm': case 'n': case 'o':
                return '6';
            case 'P': case 'Q': case 'R': case 'S': 
            case 'p': case 'q': case 'r': case 's':
                return '7';
            case 'T': case 'U': case 'V': 
            case 't': case 'u': case 'v':
                return '8';
            case 'W': case 'X': case 'Y': case 'Z': 
            case 'w': case 'x': case 'y': case 'z':
                return '9';
            default:
                return '1';
        }
    }

    public static boolean thuannghich(String s) {
        int n = s.length();

        for(int i = 0;i <=(n-1)/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        
        while(t-- >0) {
            String message = scanner.nextLine();
            String result = new String();

            for(int i = 0; i < message.length(); i++) {
                result += getNum(message.charAt(i));
            }
            if(thuannghich(result)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
