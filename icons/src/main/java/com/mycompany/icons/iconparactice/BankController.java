/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icons.iconparactice;

/**
 *
 * @author Mark
 */
public class BankController {
    private BankModel model;
    private ATMView view;
    private Account currentAccount;
    
    public static void main(String[] args) {
        buildSession();
    }
    
    public static void buildSession() {
        BankController cont = new BankController();
        // Tell view to get user's pin number and give it back to me
        cont.model = new BankModel();
        cont.view = new ATMView();
        cont.view.control = cont;
        
    }
    
    // this method will be called when the user clicks login button on view
    public void initializeAccount(int pin) {
        // Account made by generateAccount is set to variable currentAccount
        currentAccount = model.generateAccount();
        
    }
}
