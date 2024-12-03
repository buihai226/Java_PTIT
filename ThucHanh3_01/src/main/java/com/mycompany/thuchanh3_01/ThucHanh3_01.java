/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thuchanh3_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class ThucHanh3_01 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Lenovo\\Desktop\\Java_PTIT\\ThucHanh3_01\\src\\main\\java\\com\\mycompany\\thuchanh3_01\\DATA.in"));
        HashSet<BigInteger> se = new HashSet<>();
        BigInteger sum = BigInteger.ZERO;
        BigInteger pro = BigInteger.ONE;
        while(sc.hasNext())
        {
            BigInteger num = new BigInteger(sc.next());
            if(se.add(num))
            {
                sum = sum.add(num);
                pro = pro.multiply(num);
            }
            
        }
        System.out.println(sum);
        System.out.println(pro);

    }
}
