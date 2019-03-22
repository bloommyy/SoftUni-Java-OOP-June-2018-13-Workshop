/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

import Unit.BaseUnit;
import battlegroundapp.*;

/**
 *
 * @author user
 */
public class Carrier extends BaseUnit{
    //Constructor
    public Carrier(String name, int range, int positionX, int positionY,
        int healthPoints, int energyPoints, int attackPoints,
        int defencePoints){
        super(name, 2, positionX, positionY, 50, 80, 15, 5);
    }
    
    @Override
    public String toString(){
        String msg;
        msg = "name is " + this.name;
        return name;
    }
}
