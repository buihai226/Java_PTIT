package tracnghiem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuizApp extends JFrame {

    private List<cauhoi> questions; // Danh sách câu hỏi
    private List<cauhoi> selectedQuestions; // Danh sách câu hỏi đã chọn ngẫu nhiên
    private int currentIndex = 0;  // Chỉ số câu hỏi hiện tại
    private JLabel questionLabel;
    private JRadioButton[] optionButtons;
    private ButtonGroup buttonGroup;
    private JButton nextButton;
    private JButton checkButton;
    private JLabel feedbackLabel;
    private JPanel quizPanel;
    private JPanel selectionPanel;

    private boolean isAnswered = false; // Đánh dấu đã kiểm tra đáp án hay chưa

    public QuizApp(List<cauhoi> questions) {
        this.questions = questions;

        // Cài đặt giao diện
        setTitle("Ứng dụng trắc nghiệm");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new CardLayout());

        // Tạo các panel
        selectionPanel = new JPanel();
        quizPanel = new JPanel(new BorderLayout());

        // Panel chọn số câu hỏi
        JLabel selectLabel = new JLabel("Chọn số câu hỏi (1 đến " + questions.size() + "): ");
        JSpinner questionCountSpinner = new JSpinner(new SpinnerNumberModel(10, 1, questions.size(), 1));
        selectionPanel.add(selectLabel);
        selectionPanel.add(questionCountSpinner);
        JButton startButton = new JButton("Bắt đầu kiểm tra");
        selectionPanel.add(startButton);

        // Panel câu hỏi
        questionLabel = new JLabel("Câu hỏi sẽ hiển thị ở đây");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        quizPanel.add(questionLabel, BorderLayout.NORTH);

        // Panel đáp án
        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        optionButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton();
            buttonGroup.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }
        quizPanel.add(optionsPanel, BorderLayout.CENTER);

        // Panel điều khiển
        JPanel controlPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        feedbackLabel = new JLabel("Hãy chọn một đáp án và bấm Check!", JLabel.CENTER);
        feedbackLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        feedbackLabel.setForeground(Color.BLUE);
        quizPanel.add(feedbackLabel, BorderLayout.SOUTH);

        checkButton = new JButton("Check");
        controlPanel.add(checkButton);

        nextButton = new JButton("Next");
        controlPanel.add(nextButton);

        quizPanel.add(controlPanel, BorderLayout.SOUTH);

        // Thêm các panel vào giao diện
        add(selectionPanel, "selectionPanel");
        add(quizPanel, "quizPanel");

        // Xử lý sự kiện nút "Start"
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int questionCount = (int) questionCountSpinner.getValue();
                selectRandomQuestions(questionCount);
                CardLayout cl = (CardLayout) getContentPane().getLayout();
                cl.show(getContentPane(), "quizPanel"); // Chuyển sang màn hình kiểm tra
                try {
                    loadQuestion();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        // Xử lý sự kiện nút "Check"
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });

        // Xử lý sự kiện nút "Next"
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    nextQuestion();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Lấy câu hỏi ngẫu nhiên
    private void selectRandomQuestions(int questionCount) {
        Collections.shuffle(questions); // Xáo trộn danh sách câu hỏi
        selectedQuestions = questions.subList(0, questionCount); // Chọn câu hỏi ngẫu nhiên
        currentIndex = 0; // Đặt lại chỉ số câu hỏi
    }

    // Hiển thị câu hỏi hiện tại
    private void loadQuestion() throws FileNotFoundException {
        if (currentIndex >= selectedQuestions.size()) {
            // Hết câu hỏi
            JOptionPane.showMessageDialog(this, "Bạn đã hoàn thành bài kiểm tra!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            dispose();
            batdau bt = new batdau();
            bt.setVisible(true);

            return;
        }

        cauhoi currentQuestion = selectedQuestions.get(currentIndex);
//        questionLabel.setText(currentQuestion.getNd());
        questionLabel.setText("<html>" + currentQuestion.getNd().replaceAll("\n", "<br>") + "</html>");

        List<String> answers = currentQuestion.getDa();

        // Hiển thị các đáp án
        for (int i = 0; i < optionButtons.length; i++) {
            if (i < answers.size()) {
                optionButtons[i].setText(answers.get(i));
                optionButtons[i].setVisible(true);
            } else {
                optionButtons[i].setVisible(false);
            }
        }

        // Xóa lựa chọn cũ và thông báo
        buttonGroup.clearSelection();
        feedbackLabel.setText("Hãy chọn một đáp án và bấm Check!");
        feedbackLabel.setForeground(Color.BLUE);
        isAnswered = false;
    }

    // Kiểm tra đáp án
    private void checkAnswer() {
        // Kiểm tra người dùng đã chọn đáp án hay chưa
        String selectedAnswer = null;
        for (JRadioButton button : optionButtons) {
            if (button.isSelected()) {
                selectedAnswer = button.getText(); // Lấy toàn bộ nội dung đáp án chọn
                isAnswered = true;
                break;
            }
        }

        if (selectedAnswer == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một đáp án trước!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // So sánh đáp án người dùng chọn với key
        cauhoi currentQuestion = selectedQuestions.get(currentIndex);
        char selectedChar = selectedAnswer.charAt(0); // Lấy chữ cái đầu tiên từ đáp án (A, B, C, D)
        char correctKey = currentQuestion.getKey().charAt(0); // Lấy chữ cái từ key

        if (selectedChar == correctKey) {
            JOptionPane.showMessageDialog(this, "ĐÚNG RỒI", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Tìm đáp án đúng từ danh sách
            int correctIndex = correctKey - 'A'; // Chuyển đổi key (A, B, C, ...) thành chỉ số (0, 1, 2, ...)
            String correctAnswer = currentQuestion.getDa().get(correctIndex); // Lấy đáp án đúng từ danh sách
            JOptionPane.showMessageDialog(this, "Sai rồi :) đáp án đúng là: \n " + correctAnswer, "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        }

    }

    // Chuyển sang câu hỏi tiếp theo
    private void nextQuestion() throws FileNotFoundException {
        String selectedAnswer = null;
        for (JRadioButton button : optionButtons) {
            if (button.isSelected()) {
                selectedAnswer = button.getText(); // Lấy toàn bộ nội dung đáp án chọn
                isAnswered = true;
                break;
            }
        }
        if (!isAnswered) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn và kiểm tra đáp án trước khi sang câu tiếp theo!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        currentIndex++;
        loadQuestion();
    }

}
