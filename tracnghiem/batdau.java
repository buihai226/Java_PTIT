package tracnghiem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author dangt
 */
public class batdau extends JFrame implements ActionListener {

    private JLabel chonchuong;
    private JComboBox<String> tenchuong;
    private JButton ok;

    public batdau() throws FileNotFoundException {
        setSize(300, 150);
        setLayout(new GridLayout(3, 1, 20, 20));
        setLocationRelativeTo(null);
        setResizable(false);

        // Label hướng dẫn chọn chương
        chonchuong = new JLabel("Chọn chương kiểm tra");
        Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("danhsachchuong.txt"), StandardCharsets.UTF_8));
        // Tạo danh sách các chương cho ComboBox
        List<String> chuongList = new ArrayList<>();
        while (sc.hasNextLine()) {
            chuongList.add(sc.nextLine());
        }
        // Khai báo JComboBox với kiểu String
        tenchuong = new JComboBox<>(chuongList.toArray(new String[0]));

        // Nút "Bắt đầu"
        ok = new JButton("Bắt đầu");

        // Thêm các thành phần vào JFrame
        add(chonchuong);
        add(tenchuong);
        add(ok);

        // Hiển thị JFrame
        setVisible(true);

        // Đăng ký ActionListener cho nút "Bắt đầu"
        ok.addActionListener(this);

        // Cài đặt đóng cửa khi thoát ứng dụng
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Lấy chương được chọn từ ComboBox
        String s = (String) tenchuong.getSelectedItem();
        this.dispose(); // Đóng cửa sổ hiện tại

        try {
            // Đọc file đáp án
            Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("answers" + s + ".txt"), StandardCharsets.UTF_8));
            String dapan = sc.nextLine().trim();

            // Đọc file câu hỏi
            sc = new Scanner(new InputStreamReader(new FileInputStream(s + ".txt"), StandardCharsets.UTF_8));
            List<cauhoi> questions = new ArrayList<>();
            List<String> da = new ArrayList<>();
            String Cauhoi = sc.nextLine();
            int i = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }

                if (line.matches("^[A-D]\\..*")) {
                    da.add(line);
                } else {
                    questions.add(new cauhoi(Cauhoi, new ArrayList<>(da), i, String.valueOf(dapan.charAt(i))));
                    i++;
                    da.clear();
                    Cauhoi = line;
                }
            }

            if (!da.isEmpty() && i < dapan.length()) {
                questions.add(new cauhoi(Cauhoi, da, i, String.valueOf(dapan.charAt(i))));
            }

            // Chạy ứng dụng QuizApp
            SwingUtilities.invokeLater(() -> new QuizApp(questions).setVisible(true));

        } catch (FileNotFoundException ee) {
            ee.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi: " + ee.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            // Khi gặp lỗi, không khởi tạo lại một cửa sổ mới mà chỉ hiển thị lại cửa sổ cũ
            // Bạn có thể giữ lại cửa sổ ban đầu và không làm lại từ đầu
            this.setVisible(true); // Hiển thị lại cửa sổ ban đầu để người dùng thử lại
        }
    }

    public String trave() {
        return (String) tenchuong.getSelectedItem();
    }
}
