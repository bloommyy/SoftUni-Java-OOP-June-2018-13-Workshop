/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombatHandler;

import Unit.*;
import java.util.List;
import Spell.*;

/**
 *
 * @author student
 */
public interface CombatHandler {

    
    public void setUnit(BaseUnit BaseUnit);

    //public BaseUnit pickNextTarget(List<BaseUnit>);
    
    public Spell generateAttack();
}
