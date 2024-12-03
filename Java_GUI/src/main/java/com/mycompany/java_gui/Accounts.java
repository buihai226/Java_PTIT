/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_gui;

/**
 *
 * @author Lenovo
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Accounts {
    private static final String ACCOUNT_FILE = "accounts.txt";

    public static boolean isUsernameExists(String username) throws IOException {
        List<String> accounts = getAccounts();
        for (String account : accounts) {
            if (account.startsWith("Tên tài khoản: " + username)) {
                System.out.println("Tên tài khoản: " + username + " đã tồn tại");
                return true;
            }
        }
        return false;
    }

    public static void saveAccount(String firstName, String lastName, String username, String password, String email, String mobile) throws IOException {
        if (isUsernameExists(username)) {
            System.out.println("Không thể thực hiện. Người dùng: " + username + " đã tồn tại.");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ACCOUNT_FILE, true))) {
            writer.write("Tên: " + firstName);
            writer.newLine();
            writer.write("Họ: " + lastName);
            writer.newLine();
            writer.write("Tài khoản: " + username);
            writer.newLine();
            writer.write("Mật khẩu: " + password);
            writer.newLine();
            writer.write("Email: " + email);
            writer.newLine();
            writer.write("SĐT: " + mobile);
            writer.newLine();
            writer.newLine();
        }
    }

    public static boolean checkCredentials(String username, String password) throws IOException {
        List<String> accounts = getAccounts();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals("Tài khoản: " + username) &&
                accounts.get(i + 1).equals("Mật khẩu: " + password)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> getAccounts() throws IOException {
        List<String> accounts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ACCOUNT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                accounts.add(line.trim());
            }
        }
        return accounts;
    }
}

