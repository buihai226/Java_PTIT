/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tach_doi_va_tinh_tong;
import java.io.FileReader;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author Lenovo
 */
public class Tach_doi_va_tinh_tong {

    public static void main(String args[]) throws Exception {
        String s = new String(Files.readAllBytes(Paths.get("DATA.in")));
        BigInteger num;
        if (s.length() == 1) {
            System.out.println(s);
        } else {
            while (s.length() > 1) {
                BigInteger l, r;
                l = new BigInteger(s.substring(0, s.length() / 2));
                r = new BigInteger(s.substring(s.length() / 2));
                num = l.add(r);
                s = num.toString();
                System.out.println(s);
            }
        }
    }
}
