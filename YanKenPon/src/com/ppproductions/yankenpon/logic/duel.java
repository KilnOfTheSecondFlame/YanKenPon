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
    private String opponentMove;
    private Integer oWinCount=0;
    private Integer pWinCount=0;
    

    
    public void fight(String PlayerMove, javax.swing.JTextArea textArea, opponent Opponent) {
        Integer Comparisation;
        
        //get Opponent & Player choices:
        opponentMove = Opponent.getPon();
        Comparisation = compareMoves(PlayerMove, opponentMove);
        if (Comparisation == WIN_PLAYER) {
            pWinCount++;
            textArea.append("Your move was superior!\n");
        }
        else if (Comparisation == WIN_OPPONENT) {
            oWinCount++;
            textArea.append("Your move was inferior!\n");
        } 
        else textArea.append("Tie!!!\n");
        
      }
    
    public String getScore(){
        return (oWinCount + " : " + pWinCount);
    }
    
    public String getOpponentMove(){
        return opponentMove;
    }
    
    public int getWinState(){
        int WinState = 0;
        if (pWinCount>=NUMBER_OF_WINS) WinState=1;
        else if (oWinCount>=NUMBER_OF_WINS) WinState=-1;
        return WinState;
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