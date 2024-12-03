package com.mycompany.day_con_k_tang_dan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day_con_k_tang_dan {
    static int n, k;
    static int[] a = new int[15];

    public static void Try(int i, ArrayList<Integer> ar) {
        if (ar.size() == k) {
            for (int j = 0; j < ar.size(); j++) {
                System.out.print(ar.get(j) + " ");
            }
            System.out.println();
            return;
        }
        for (int j = i; j < n; j++) {
            // Kiểm tra điều kiện để dãy con tăng dần
            if (ar.isEmpty() || ar.get(ar.size() - 1) <= a[j]) {
                ar.add(a[j]);
                Try(j + 1, ar);
                ar.remove(ar.size() - 1); // Loại bỏ phần tử cuối cùng vừa thêm vào
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a,0,n);
            ArrayList<Integer> ar = new ArrayList<>(); // Khởi tạo lại ar cho mỗi lần test
            Try(0, ar);
        }
        sc.close();
    }
}