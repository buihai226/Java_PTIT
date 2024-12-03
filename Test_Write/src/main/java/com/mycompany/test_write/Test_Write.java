/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_write;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class Test_Write {

    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "Xin chào, đây là nội dung ghi vào file!";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Ghi dữ liệu vào file thành công!");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
