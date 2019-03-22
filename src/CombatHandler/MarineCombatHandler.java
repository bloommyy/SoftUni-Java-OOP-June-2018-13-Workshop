/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombatHandler;

import Spell.*;
import Unit.*;
import java.util.List;

/**
 *
 * @author student
 */
public class MarineCombatHandler extends BaseCombatHandler{
    private final int CLOSEST_ENEMY = 0;
    private final int HALF_MARINE_HEALTH = 25;
    
    //Methods
    /*public Unit pickNextTarget(List<Unit>){
        
    }*/
    
    public int getAttackDamage(Marine Marine){
        return Marine.getAttackPoints();
    }
    
    public Spell generateAttack(){
        return null;
    }
    
}
