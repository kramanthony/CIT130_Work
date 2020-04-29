/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icons.iconparactice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Mark
 */
public class Login {
    public static void main(String[] args) {
        X obj = new X();
    }
}
    class X extends JFrame {
        public X() {
            
            JButton b = new JButton("Add Form");
            b.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
                    new PinInputReader();
                    dispose();
                }
        });
            add(b);
            setLayout(new FlowLayout());
            setVisible(true);
            setSize(400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
