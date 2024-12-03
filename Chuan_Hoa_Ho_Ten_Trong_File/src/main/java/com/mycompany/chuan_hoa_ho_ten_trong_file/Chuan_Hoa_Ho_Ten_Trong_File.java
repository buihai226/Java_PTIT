/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuan_hoa_ho_ten_trong_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Chuan_Hoa_Ho_Ten_Trong_File {
    public static String ChuanHoa(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split("\\s+");
        for(String x : str)
        {
            //chữ đầu in hoa
            sb.append(x.substring(0,1).toUpperCase()).append(x.substring(1).toLowerCase());
            sb.append(" ");
        }
        String ans = sb.toString();
        return ans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            if(s.equals("END"))
            {
                break;
            }
            String ans = ChuanHoa(s);
            System.out.println(ans);
        }
    }
}
