/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.file_nhi_phan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class File_nhi_phan {

    public static void main(String[] args) {
        
        try {
            // ghi file
            FileOutputStream fos = new FileOutputStream("STUDENT.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.write(123);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File_nhi_phan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(File_nhi_phan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
