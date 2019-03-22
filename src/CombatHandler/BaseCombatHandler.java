/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombatHandler;

import Spell.Spell;
import Unit.*;

/**
 *
 * @author student
 */
public class BaseCombatHandler implements CombatHandler{
    
    private Unit unit;
    
    //Methods
    @Override
    public void setUnit(BaseUnit BaseUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spell generateAttack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
