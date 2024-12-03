/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.BoxLayout;

/**
 *
 * @author Lenovo
 */
public class GUI {

    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.add(new Label("This is my label"));
        f.setSize(300,150);
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        Panel p1 = new Panel();
    }
}
