/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ppproductions.yankenpon.logic;

import java.util.Random;

/**
 *
 * @author pascalbaumann
 */
public class opponent {
    final private Double pRock;
    final private Double pScissors;
    final private String Name;
    final private Random randomGenerator = new Random();
    
    
    public opponent(){
        pRock=Double.valueOf(1/3);
        pScissors=Double.valueOf(1/3);
        Name="Default";
    }
    
    public opponent(String Name){
        this.Name=Name;
        switch (Name) {
            case "Rocky":
                pRock=1.0;
                pScissors=0.0;
                break;
            case "Dwayne 'The Rock' Johnson":
                pRock=0.8;
                pScissors=1.0;
                break;
            case "Edward":
                pRock=0.0;
                pScissors=1.0;
                break;
            case "Paperboy":
                pRock=0.0;
                pScissors=0.0;
                break;
            default:
                pRock=Double.valueOf(1/3);
                pScissors=Double.valueOf(1/3);
                break;
        }
    }

    public String getName() {
        return Name;
    }
    
    public String getPon(){
        String pon;
        Double decidedMove=randomGenerator.nextDouble();
        if (decidedMove<=pRock) pon="Rock";
        else if (decidedMove<=(pRock+pScissors)) pon="Scissors";
        else pon="Paper";
        return pon;
    }
    
    public String getPonSpecial(){
        String pon;
        switch (Name){
            case "Saruman":
                pon="Fireball";
                break;
            default:
                pon=getPon();
                break;
        }
        return pon;
    }
}
