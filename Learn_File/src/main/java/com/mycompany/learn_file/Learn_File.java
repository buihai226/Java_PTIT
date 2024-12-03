/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.learn_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Learn_File {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        int[] a = new int[1001];
        for (int i = 0; i < 1001; i++) {
            a[i] = 0;
        }
        ArrayList<Integer> ar = new ArrayList<>();
        
        while (sc.hasNext()) { // Đọc từng từ
            try {
                int num = Integer.parseInt(sc.next());
                if (num >= 0 && num <= 1000) { // Đảm bảo chỉ số nằm trong giới hạn của mảng
                    a[num] += 1;
                    if (!ar.contains(num)) {
                        ar.add(num);
                    }
                }
            } catch (NumberFormatException e) {
                // Bỏ qua nếu không phải số nguyên
            }
        }
        
        Collections.sort(ar);
        for (int x : ar) {
            System.out.println(x + " " + a[x]);
        }
        
        sc.close(); // Đóng Scanner sau khi hoàn thành   
    }
}
