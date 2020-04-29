/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icons.iconparactice;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Mark
 */
public class BankModel {

    public void generateAccount(int pinNumber) {
        Random rand = new Random();
        Account act = new Account();
        act.setMaxDepAmount(pinNumber);
        act.getMaxWithAmount();
        act.getMinDepAmount();
        act.getMinWithAmount();
        
        int min = 1;
        int max = 9999;
        int randomMin = rand.nextInt(max);
        int randomMax = rand.nextInt(min);
        pinNumber = randomMax - randomMin;
    }
}
