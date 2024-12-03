/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test071102;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Test071102 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Lenovo\\Desktop\\Java_PTIT\\Test071102\\src\\main\\java\\com\\mycompany\\test071102\\DATA.in"));
        long sum = 0;
        while(sc.hasNext())
        {
            String s = sc.next();
            try
            {
                sum = sum + Integer.parseInt(s);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println(sum);
    }
}
