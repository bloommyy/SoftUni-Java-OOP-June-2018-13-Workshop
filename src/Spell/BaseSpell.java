/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spell;

/**
 *
 * @author student
 */
public class BaseSpell implements Spell{

    private int damage;
    private int energyCost;
    
    //Constructor
    public BaseSpell(int dmg, int eC){
        this.damage = dmg;
        this.energyCost = eC;
    }
    
    
    //Methods
    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public int getEnergyCost() {
        return this.energyCost;
    }
    
}
