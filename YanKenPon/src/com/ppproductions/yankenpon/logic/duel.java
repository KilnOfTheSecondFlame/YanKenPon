/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *DEDICATED TO n00b574y3r_69.
 */




package com.ppproductions.yankenpon.logic;

import java.util.Scanner;

/**
 *
 * @author pki
 */
public class duel {
    Scanner Puffer = new Scanner(System.in);
    final Integer NUMBER_OF_WINS = 3;
    
    final Integer WIN_PLAYER = 0;
    final Integer WIN_OPPONENT = 1;
    final Integer TIE = 2;
    
    private String opponent;
    private Integer oWinCount=0;
    private Integer pWinCount=0;
    
    duel (String opponent){
        this.opponent=opponent;
    }
    
    public Boolean fight() {
        opponent Opponent = new opponent();
        Boolean Win=true;
        String PlayerMove;
        String OpponentMove;
        Integer Comparisation;
        
        do {
            //get Opponent & Player choices:
            OpponentMove = Opponent.getPon();
            System.out.println("Your Move: ");
            PlayerMove = Puffer.nextLine();
            Comparisation = compareMoves(PlayerMove, OpponentMove);
            if (Comparisation == WIN_PLAYER) {
                pWinCount++;
                System.out.println("Your move was superior!");
            }
            else if (Comparisation == WIN_OPPONENT) {
                oWinCount++;
                System.out.println("Your move was inferior!");
            } 
            else System.out.println("Tie!!!");
        } while (oWinCount < NUMBER_OF_WINS && pWinCount < NUMBER_OF_WINS);
        
        if (pWinCount < oWinCount) Win = false;
        return Win;
      }
    
    private Integer compareMoves(String PlayerMove, String OpponentMove) {
        Integer result = null;
        switch (PlayerMove) {
            case "Rock":
                if ("Rock".equals(OpponentMove)) result = TIE;
                if ("Paper".equals(OpponentMove)) result = WIN_OPPONENT;
                if ("Scissors".equals(OpponentMove)) result = WIN_PLAYER;      
                break;
            case "Paper":
                if ("Paper".equals(OpponentMove)) result = TIE;
                if ("Scissors".equals(OpponentMove)) result = WIN_OPPONENT;
                if ("Rock".equals(OpponentMove)) result = WIN_PLAYER;      
                break;
            case "Scissors":
                if ("Scissors".equals(OpponentMove)) result = TIE;
                if ("Rock".equals(OpponentMove)) result = WIN_OPPONENT;
                if ("Paper".equals(OpponentMove)) result = WIN_PLAYER;      
                break;
            default:
                result = WIN_OPPONENT;
                break;
        }
        return result;    
    }
}