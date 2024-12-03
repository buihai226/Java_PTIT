/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo
 */
public class LoginForm extends Frame implements ActionListener {
    TextField tf;
    public LoginForm(){
        setLayout(new FlowLayout());
        tf = new TextField("        ");
        add(tf);
        Button bt = new Button("Click");
        add(bt);
        bt.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello World");
    }
    
}
