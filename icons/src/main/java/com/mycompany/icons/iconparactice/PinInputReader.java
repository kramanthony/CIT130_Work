/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icons.iconparactice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Mark
 */
public class PinInputReader extends JFrame {
    
    private int accOne = 1589;
    private int accOneBal = 44569;
    private int accTwo = 4315;
    private double accTwoBal = 37183.19;
    
    JButton buttonDeposit, buttonWithdraw, buttonTransLog;
    JTextField pinInput = new JTextField(30);
    JLabel insertPin = new JLabel();
    GridBagConstraints gbcd = new GridBagConstraints();
    GridBagConstraints gbcw = new GridBagConstraints();
    GridBagConstraints gbctl = new GridBagConstraints();
    GridBagConstraints gbclab = new GridBagConstraints();
    GridBagConstraints gbcpi = new GridBagConstraints();
    GridBagConstraints gbcpr = new GridBagConstraints();
    GridBagConstraints gbcip = new GridBagConstraints();
    GridBagConstraints gbcia = new GridBagConstraints();
    GridBagConstraints gbcsub = new GridBagConstraints();
    GridBagConstraints gbcar = new GridBagConstraints();
    Account b = new Account();
    
    
    
    public PinInputReader(){
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setLayout(new GridBagLayout());
        
        JLabel lab = new JLabel("Choose a service");
        lab.setForeground(Color.black);
        gbclab.gridx = 1;
        gbclab.gridy = 1;
        
        // BUTTONS
        JButton buttonWithdraw = new JButton("Withdraw") ;
        gbcd.gridx = 1;
        gbcd.gridy = 50;
        buttonWithdraw.setPreferredSize(new Dimension(175, 30));
        
        JButton buttonDeposit = new JButton("Deposit");
        gbcw.gridx = 1;
        gbcw.gridy = 100;
        buttonDeposit.setPreferredSize(new Dimension(175, 30));
        
        JButton buttonTransLog = new JButton("Transaction Log");
        gbctl.gridx = 1;
        gbctl.gridy = 150;
        buttonTransLog.setPreferredSize(new Dimension(175, 30));
        
        // pin input textfield
        JTextField pinInput = new JTextField(30);
        gbcpi.gridx = 1;
        gbcpi.gridy = 250;
        pinInput.setPreferredSize(new Dimension(175,30));
        
        // code start for input reader and label
        JLabel inputAmount = new JLabel("Insert Amount");
        inputAmount.setForeground(Color.black);
        gbcia.gridx = 1;
        gbcia.gridy = 375;
        
        JTextField amountReader = new JTextField(30);
        gbcar.gridx = 1;
        gbcar.gridy = 400;
        pinInput.setPreferredSize(new Dimension(175,30));
        // code end for input reader and label
        
        /*
        * TO-DO: Set Submit button to be used as an action listener for PIN input and also deposit/withdraw listener
        */
        
        JButton submitButton = new JButton("Submit");
        gbcsub.gridx = 1;
        gbcsub.gridy = 425;
        submitButton.setPreferredSize(new Dimension(175,30));
        
        // pin input label
        JLabel inputPin = new JLabel("Insert PIN");
        inputPin.setForeground(Color.black);
        gbcip.gridx = 1;
        gbcip.gridy = 200;
        
        // declare color code for all buttons
        buttonDeposit.setBackground(Color.red);
        buttonDeposit.setForeground(Color.white);
        
        buttonWithdraw.setBackground(Color.red);
        buttonWithdraw.setForeground(Color.white);

        buttonTransLog.setBackground(Color.red);
        buttonTransLog.setForeground(Color.white);
        
            b.setMinDepAmount(20);
            b.setMaxDepAmount(1000);
            b.setMinWithAmount(5);
            b.setMaxWithAmount(250);
        
        // declare listeners
        buttonWithdraw.addActionListener((ActionEvent e) -> {
            System.out.println("Insert amount you'd like to withdraw");
            int totalAmount = Integer.parseInt(amountReader.getText());
            if(b.getMaxWithAmount() > totalAmount){
                System.out.println("You've taken: " + totalAmount + " from your account.");
                accOneBal = accOneBal - totalAmount;
                System.out.println("Your current account balance is: " + accOneBal);
            }else if(b.getMaxWithAmount() < totalAmount) {
                System.out.println("You can only withdraw a maximum of " + b.getMaxWithAmount());
            }else if(b.getMinWithAmount() < totalAmount) {
                accOneBal = accOneBal - totalAmount;
                System.out.println("Your current account balance is: " + accOneBal);
            }else if(b.getMinWithAmount() > totalAmount) {
                System.out.println("You can only withdraw a minimum of: " + b.getMinWithAmount());
            } // close else if
            
            if(buttonWithdraw.getBackground() == Color.red){
                buttonWithdraw.setBackground(Color.cyan);
                buttonWithdraw.setBackground(Color.red);
            }else{
                buttonWithdraw.setBackground(Color.red);
            }
            System.out.println("\n");
        
        });
        buttonDeposit.addActionListener((ActionEvent e) -> {

            int totalAmount = Integer.parseInt(amountReader.getText());
            if(totalAmount > b.getMinDepAmount()){
                System.out.println("You've added: " + totalAmount + " to your account.");
                accOneBal = totalAmount + accOneBal;
                System.out.println("Your current account balance is: " + accOneBal);
            } else if(totalAmount < b.getMinDepAmount()) {
                System.out.println("You must deposit at least " + b.getMinDepAmount() + " into your account.");
            } // close else if for min deposit amount
            if(totalAmount > b.getMaxDepAmount()) {
                System.out.println("You can deposit a maximum of " + b.getMaxDepAmount());
            } else if(totalAmount < b.getMaxDepAmount()) {
                System.out.println("You've added: " + totalAmount + " to your  account.");
            }
            
            if(buttonDeposit.getBackground() == Color.red){
                buttonDeposit.setBackground(Color.cyan);
            }else{
                buttonDeposit.setBackground(Color.red);
            }
            
        });
        
        buttonTransLog.addActionListener((ActionEvent e) -> {
            
        });     
        
        // add everything to mainPanel
        mainPanel.add(buttonDeposit,gbcd);
        mainPanel.add(buttonWithdraw,gbcw);
        //mainPanel.add(buttonTransLog,gbctl);
        mainPanel.add(lab,gbclab);
        mainPanel.add(pinInput, gbcpi);
        mainPanel.add(inputPin,gbcip);
        mainPanel.add(submitButton,gbcsub);
        mainPanel.add(inputAmount,gbcia);
        mainPanel.add(amountReader,gbcar);
        add(mainPanel);

        
    } // close constructor
    
    // set Frame
    public static void main(String[] args) {
        JFrame mainFrame = new PinInputReader();
        mainFrame.setTitle("MAZE BANK INTERFACE");
        mainFrame.setSize(500, 500);
        mainFrame.setLocation(231, 411);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    } // close frame

} // close class