/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author dangt
 */
public class Tracnghiem {
      public static void main(String[] args) throws FileNotFoundException {
          batdau bt= new batdau();
          bt.setVisible(true);

          
//        try {
//            // Đọc file đáp án
//            Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("answers"+s+".txt"), StandardCharsets.UTF_8));
//            String dapan = sc.nextLine().trim();
//
//            // Đọc file câu hỏi
//            sc = new Scanner(new InputStreamReader(new FileInputStream(s+".txt"), StandardCharsets.UTF_8));
//            List<cauhoi> questions = new ArrayList<>();
//            List<String> da = new ArrayList<>();
//            String Cauhoi = sc.nextLine();
//            int i = 0;
//
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine().trim();
//                if (line.isEmpty()) {
//                    continue;
//                }
//
//                if (line.matches("^[A-D]\\..*")) {
//                    da.add(line);
//                } else {
//                    questions.add(new cauhoi(Cauhoi, new ArrayList<>(da), i, String.valueOf(dapan.charAt(i)))); i++;
//                    da.clear();
//                    Cauhoi = line;
//                }
//            }
//
//            if (!da.isEmpty() && i < dapan.length()) {
//                questions.add(new cauhoi(Cauhoi, da, i, String.valueOf(dapan.charAt(i))));
//            }
//
//            // Chạy ứng dụng
//            SwingUtilities.invokeLater(() -> new QuizApp(questions).setVisible(true));
//            
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }
}
