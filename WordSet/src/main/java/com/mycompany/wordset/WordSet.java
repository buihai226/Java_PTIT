/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordset;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class WordSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
