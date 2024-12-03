/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

    public static void main(String[] args) throws FileNotFoundException {
        // Đọc file dapan.txt với mã hóa UTF-8
        Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("answerschuong6.txt"), StandardCharsets.UTF_8));
        String dapan = sc.nextLine(); // Giả sử chỉ có một dòng đáp án

        // Đọc file chuong1.txt với mã hóa UTF-8
        sc = new Scanner(new InputStreamReader(new FileInputStream("chuong6.txt"), StandardCharsets.UTF_8));
        List<cauhoi> lch = new ArrayList<>();
        int i = 0;
        List<String> da = new ArrayList<>();
        // Đọc câu hỏi và đáp án
        String Cauhoi = sc.nextLine().trim();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim(); // Đọc câu hỏi và loại bỏ khoảng trắng dư thừa
            if (line.isEmpty()) {
                continue; // Bỏ qua dòng trống
            }

            if (line.startsWith("A.") || line.startsWith("B.") || line.startsWith("C.") || line.startsWith("D.")) {
                da.add(line); // Thêm đáp án vào danh sách
            } else {
                lch.add(new cauhoi(Cauhoi, da, i,String.valueOf(dapan.charAt(i))));
                        i+=1;
                da.clear();
                Cauhoi= line;
            }
        }
        lch.add(new cauhoi(Cauhoi, da, i,String.valueOf(dapan.charAt(i))));
                        i+=1;
        for(cauhoi x: lch){
            System.out.println(x.getNd());
            List<String> s= x.getDa();
            for(String ss: s){
                System.out.println(ss);
            }
            System.out.println(x.getKey());
        }

   
    }

    // In kết quả để kiểm tra
   
}

