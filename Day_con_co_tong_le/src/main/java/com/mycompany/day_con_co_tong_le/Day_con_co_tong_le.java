/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_con_co_tong_le;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Day_con_co_tong_le {
    static byte n; // Sử dụng kiểu byte cho n
    static int test; // Số bộ test (sử dụng int vì có thể lớn hơn giá trị tối đa của byte)
    static byte[] a = new byte[15]; // Sử dụng kiểu byte cho a
    static int[] use = new int[15]; // Cần giữ nguyên kiểu int cho mảng use
    static ArrayList<Integer> ans = new ArrayList<>();

    public static void Try(int i) {
        if (i >= n) { // Điều kiện dừng đệ quy
            int sum = 0;
            for (int j = 0; j < n; j++) { // Bắt đầu từ 0
                if (use[j] == 1) {
                    sum += a[j];
                }
            }

            if (sum % 2 == 1) {
                ArrayList<Integer> ar = new ArrayList<>();
                for (int j = 0; j < n; j++) { // Bắt đầu từ 0
                    if (use[j] == 1) {
                        ar.add((int) a[j]); // Chuyển đổi byte sang int khi thêm vào danh sách
                    }
                }
                Collections.sort(ar, Collections.reverseOrder());
                for (int t = 0; t < ar.size(); t++) {
                    System.out.print(ar.get(t) + " ");
                }
                System.out.println();
            }
            return;
        }

        for (int j = 0; j <= 1; j++) {
            use[i] = j;
            Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt(); // Chỉ sử dụng int cho test
        while (test-- > 0) {
            n = sc.nextByte(); // Đọc n dưới dạng byte
            for (int i = 0; i < n; i++) { // Bắt đầu từ 0
                a[i] = sc.nextByte(); // Đọc các phần tử của a dưới dạng byte
                use[i] = 0;
            }
            // Sắp xếp mảng a theo thứ tự giảm dần
            Byte[] aObj = new Byte[n]; // Khởi tạo mảng Byte
            for (int i = 0; i < n; i++) { // Bắt đầu từ 0
                aObj[i] = a[i]; // Chuyển đổi sang Byte
            }
            Arrays.sort(aObj, Collections.reverseOrder()); // Sắp xếp giảm dần
            for (int i = 0; i < n; i++) { // Bắt đầu từ 0
                a[i] = aObj[i]; // Chuyển đổi lại về byte[]
            }
            Try(0); // Bắt đầu đệ quy từ 0
            ans.clear();
        }
        sc.close(); // Đóng Scanner
    }
}