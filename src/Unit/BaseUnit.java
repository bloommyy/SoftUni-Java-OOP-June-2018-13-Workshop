/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

/**
 *
 * @author user
 */
public class BaseUnit implements Unit {

    protected String name;
    protected int range;
    protected int positionX;
    protected int positionY;
    protected int healthPoints;
    protected int energyPoints;
    protected int attackPoints;
    protected int defencePoints;
    //private CombatHandler combatHandler;
    
    //Constructor
    public BaseUnit(String name, int range, int positionX, int positionY,
            int healthPoints, int energyPoints, int attackPoints,
            int defencePoints) {
        this.name = name;
        this.range = range;
        this.positionX = positionX;
        this.positionY = positionY;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
    }

    //Methods
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getRange() {
        return this.range;
    }

    @Override
    public int getPositionX() {
        return this.positionX;
    }

    @Override
    public int getPositionY() {
        return this.positionY;
    }

    @Override
    public void setPosition(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public int getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public void setHealthPoints(int hP) {
        this.healthPoints = hP;
    }

    @Override
    public int getEnergyPoints() {
        return this.energyPoints;
    }

    @Override
    public void setEnergyPoints(int eP) {
        this.energyPoints = eP;
    }

    @Override
    public int getAttackPoints() {
        return this.attackPoints;
    }

    @Override
    public int getDefencePoints() {
        return this.defencePoints;
    }

    @Override
    public String getCombatHandler() {
        String msg;
        msg = "Gets Combat Handler...";
        return msg;
    }

    @Override
    public String toString() {
        String msg;
        msg = this.name + " has a range of " + this.range + " and is on"
                + " position (" + this.positionX + "," + this.positionY + ")."
                + "It also has " + this.healthPoints + " hp, " 
                + this.energyPoints + " energy points, " + this.attackPoints +
                " attack points and " + this.defencePoints + " defence points.\n";
        return msg;
    }

}
