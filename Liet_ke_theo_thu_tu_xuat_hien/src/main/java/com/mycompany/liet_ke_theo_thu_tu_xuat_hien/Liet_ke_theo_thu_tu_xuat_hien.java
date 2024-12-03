/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.liet_ke_theo_thu_tu_xuat_hien;

import java.io.*;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Liet_ke_theo_thu_tu_xuat_hien {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
        TreeSet<String> se = new TreeSet();// số từ khác nhau trong file NHIPHAN.in
        ois.close();
        for(String x : arr)
        {
            String[] tmp = x.trim().split("\\s+");
            for(String s : tmp)
            {
                se.add(s.toLowerCase());
            }
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext())
        {
            String s = sc.next().toLowerCase();
            if(se.contains(s))
            {
                System.out.println(s);
                se.remove(s);
            }
        }
    }
}

//import java.io.FileWriter;
//import java.io.IOException;
//
//public class WriteToFileExample {
//    public static void main(String[] args) {
//        String filePath = "output.txt";
//        String content = "Xin chào, đây là nội dung ghi vào file!";
//
//        try (FileWriter writer = new FileWriter(filePath)) {
//            writer.write(content);
//            System.out.println("Ghi dữ liệu vào file thành công!");
//        } catch (IOException e) {
//            System.out.println("Có lỗi xảy ra: " + e.getMessage());
//        }
//    }
//}