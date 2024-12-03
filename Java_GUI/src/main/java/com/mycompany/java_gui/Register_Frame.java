/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
/**
 *
 * @author Lenovo
 */
public class Register_Frame extends JFrame {
    private JTextField firstNameField, lastNameField, usernameField, passwordField, emailField, mobileField;

    public Register_Frame() {
        setTitle("Người dùng mới");
        setSize(750, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        // Tiêu đề
        JLabel myLabel = new JLabel("Người dùng mới");
        myLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        myLabel.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(myLabel);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 15, 0));
        add(mainPanel);

        // Panel chứa các trường nhập liệu
        JPanel formPanel = new JPanel(new GridLayout(3,2, 20,20));
        formPanel.setBorder(BorderFactory.createEmptyBorder(30, 20, 70, 30));
        // Tạo các trường nhập liệu và nhãn tương ứng
        firstNameField = new JTextField(15);
        lastNameField = new JTextField(15);
        usernameField = new JTextField(15);
        passwordField = new JTextField(15);
        emailField = new JTextField(15);
        mobileField = new JTextField(15);

        // Thêm các nhãn và trường nhập liệu vào formPanel
        formPanel.add(new JLabel("Tên", JLabel.RIGHT));
        formPanel.add(firstNameField);
        formPanel.add(new JLabel("Tên đăng nhập", JLabel.RIGHT));
        formPanel.add(usernameField);

        formPanel.add(new JLabel("Họ", JLabel.RIGHT));
        formPanel.add(lastNameField);
        formPanel.add(new JLabel("Mật khẩu", JLabel.RIGHT));
        formPanel.add(passwordField);

        formPanel.add(new JLabel("Email", JLabel.RIGHT));
        formPanel.add(emailField);
        formPanel.add(new JLabel("SĐT", JLabel.RIGHT));
        formPanel.add(mobileField);

        mainPanel.add(formPanel, BorderLayout.CENTER);

        // Panel chứa các nút Register và Login
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton registerButton = new JButton("Đăng ký");
        registerButton.addActionListener(new RegisterButtonListener());

        JButton loginButton = new JButton("Đăng nhập");
        loginButton.addActionListener(e -> {
            dispose();
            new Login_Frame();
        });

        buttonPanel.add(registerButton);
        buttonPanel.add(Box.createHorizontalStrut(500)); 
        buttonPanel.add(loginButton);

        mainPanel.add(buttonPanel);

        // Thêm mainPanel vào JFrame
        add(mainPanel);
        setVisible(true);
        }

        private class RegisterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String firstName = firstNameField.getText().trim();
            String lastName = lastNameField.getText().trim();
            String username = usernameField.getText().trim();
            String password = passwordField.getText().trim();
            String email = emailField.getText().trim();
            String mobile = mobileField.getText().trim();

            try {
                if (Accounts.isUsernameExists(username)) {
                    JOptionPane.showMessageDialog(Register_Frame.this, "Tên người dùng đã được sử dụng");
                } else {
                    Accounts.saveAccount(firstName, lastName, username, password, email, mobile);
                    JOptionPane.showMessageDialog(Register_Frame.this, "Đăng ký thành công!");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(Register_Frame.this, "Có lỗi khi lưu thông tin tài khoản.");
            }
        }
    }
}

