/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.danh_dau_chu_cai;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class Danh_dau_chu_cai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> res = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            res.add(s.charAt(i));
        }
        System.out.println(res.size());

    }
}
