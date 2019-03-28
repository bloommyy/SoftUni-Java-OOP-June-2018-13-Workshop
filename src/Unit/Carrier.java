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
    public Carrier(String name, int positionX, int positionY){
        super(name, 2, positionX, positionY, 50, 80, 15, 5);
    }
    
    @Override
    public String toString(){
        String msg;
        msg = this.name + " has a range of " + this.range + " and is on"
                + " position (" + this.positionX + "," + this.positionY + ")."
                + "It also has " + this.healthPoints + " hp, " 
                + this.energyPoints + " energy points, " + this.attackPoints +
                " attack points and " + this.defencePoints + " defence points.\n";
        return msg;
    }
}
