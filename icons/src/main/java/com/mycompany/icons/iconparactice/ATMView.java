/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icons.iconparactice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mark
 */
public class ATMView extends JFrame {
    int getLoginPin;
    BankController control;
    GridBagConstraints gbctf = new GridBagConstraints();
    GridBagConstraints gbcpi =  new GridBagConstraints();
    JLabel label = new JLabel();
    JTextField pinInput = new JTextField(30);
    
    public ATMView() {
        JPanel mainPanel = new JPanel(new GridBagLayout());


        mainPanel.setLayout(new GridBagLayout());
            
            JLabel label = new JLabel("Insert Pin");
            gbcpi.gridx = 1;
            gbcpi.gridy = 1;
            label.setForeground(Color.black);
            
            // create button
            
            JTextField pinInput = new JTextField(5);
            gbctf.gridx = 1;
            gbctf.gridy = 2;
            
            mainPanel.add(label,gbcpi);
            mainPanel.add(pinInput,gbctf);
            add(mainPanel);
            
            
            pinInput.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
                int totalAmount = Integer.parseInt(pinInput.getText());
                getLoginPin = totalAmount;
                }
        });
            // in button listener, ask to make acount given from user


    }
        public void getPinNumber(int getLoginPin) {
            this.getLoginPin = getLoginPin;
        }
        public static void main(String[] args) {
            JFrame mainFrame = new ATMView();
            mainFrame.setTitle("ATM LOGIN");
            mainFrame.setSize(500, 500);
            mainFrame.setLocation(231, 411);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);
        }
}


