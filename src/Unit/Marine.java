/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

import Unit.BaseUnit;

/**
 *
 * @author user
 */
public class Marine extends BaseUnit{
    //Constructor
    public Marine(String name, int range, int positionX, int positionY,
        int healthPoints, int energyPoints, int attackPoints,
        int defencePoints){
        super(name, 1, positionX, positionY, 50, 80, 15, 5);
    }
}
