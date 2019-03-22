/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit;

import javax.swing.text.Position;

/**
 *
 * @author user
 */
public interface Unit {

    public String getName();

    public int getRange();

    public int getPositionX();

    public int getPositionY();

    public void setPosition(int x, int y);

    public int getHealthPoints();

    public void setHealthPoints(int hP);

    public int getEnergyPoints();

    public void setEnergyPoints(int eP);

    public int getAttackPoints();

    public int getDefencePoints();

    public String getCombatHandler();
}
