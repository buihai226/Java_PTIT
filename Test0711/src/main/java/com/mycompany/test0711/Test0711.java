/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test0711;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Test0711 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        
        try{
            inputStream = new FileInputStream("inStream.txt");
            outputStream = new FileOutputStream("outStream.txt");
            
            int c;
            while((c = inputStream.read()) != -1 )
            {
                outputStream.write(c);
            }
        }finally{
            if(inputStream !=  null)
            {
                inputStream.close();
            }
            if(outputStream != null)
            {
                outputStream.close();
            }
        }
    }
}
