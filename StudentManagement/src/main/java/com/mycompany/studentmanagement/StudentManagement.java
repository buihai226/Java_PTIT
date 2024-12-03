/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagement;

import Learning.Student;

/**
 *
 * @author Lenovo
 */
public class StudentManagement {

    public static void main(String[] args) {
        Student sv = new Student();
        //sv.input();
        sv.output();
        Student sv2 = new Student("B123","Nguyen Van A",2004,"HN");
        sv2.output();
    }
}
