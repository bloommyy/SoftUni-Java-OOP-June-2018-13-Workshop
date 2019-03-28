/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlegroundapp;

import Battleground.BattlegroundImpl;
import Unit.Carrier;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carrier c1 = new Carrier("Pesho", 0, 0);
        BattlegroundImpl battleground = new BattlegroundImpl();
        System.out.print(c1);
        battleground.add(c1);
        battleground.move(c1, 2, 3);
        System.out.print(c1);
        battleground.remove(c1);
        c1.setPosition(1, 1);
        System.out.print(c1);
    }
    
}
