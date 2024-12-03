/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.d181124;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class D181124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3;
        int y = 0 ; // Khai báo bên ngoài khối try để có thể sử dụng sau đó.

        try {
            y = Integer.parseInt(sc.next());
        } catch (Exception e) {
            System.out.println("Invalid Number");
             // Thêm `return` để thoát khỏi phương thức nếu gặp lỗi.
        }

        int ans = x + y;
        System.out.println(ans); // In kết quả của phép cộng.
    }
}
