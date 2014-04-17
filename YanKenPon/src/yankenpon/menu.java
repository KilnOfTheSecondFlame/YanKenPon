/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yankenpon;

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
        m.setOpponent();
        System.out.print(m.getOpponent() + "\n");
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent() {
        System.out.println("Choose your opponent: Randy, Ray, Robbie");
        this.opponent=Puffer.nextLine();
    }
    
    
    
}
