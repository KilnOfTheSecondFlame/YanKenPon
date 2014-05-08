/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ppproductions.yankenpon.logic;

import java.util.Scanner;

/**
 *
 * @author pascalbaumann
 */
public class menu {
    Scanner Puffer = new Scanner(System.in);
    private String opponent;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu m = new menu();
        Boolean Win;
        m.setOpponent();
        duel d = new duel(m.getOpponent());
        Win = d.fight();
        if (Win) System.out.println("You won!");
        else System.out.println("Looooooooooooooser!!!!");
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent() {
        String Opponent = "Init";
        while ("Init".equals(Opponent)) {
            System.out.println("Choose your opponent: ");
            Opponent=Puffer.nextLine();
        }
    }
    
    
    
}
