/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlegroundapp;

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
        Carrier c1 = new Carrier("Pesho", 3, 0, 0, 23, 53, 65, 34);
        System.out.print(c1);
    }
    
}
