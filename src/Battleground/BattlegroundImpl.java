/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battleground;

import Unit.Unit;
import Unit.BaseUnit;
import java.util.List;

/**
 *
 * @author user
 */
public class BattlegroundImpl implements Battleground {

    private Unit[][] battleground;

    //Methods
    private void validatePosition(int x, int y) {
        if(battleground[x][y] != null){
            System.out.println(battleground[x][y].getName());
        }else{
            System.out.println("Position is free!");
        }
    }

    @Override
    public List<BaseUnit> getUnitsInRange(int x, int y) {
        return null;
    }

    @Override
    public void add(BaseUnit BaseUnit) {
        this.battleground[BaseUnit.getPositionX()][BaseUnit.getPositionY()]
                = BaseUnit;
    }

    @Override
    public void remove(BaseUnit BaseUnit) {
        this.battleground[BaseUnit.getPositionX()][BaseUnit.getPositionY()] = 
                null;
    }

    @Override
    public void move(BaseUnit BaseUnit, int x, int y) {
        remove(BaseUnit);
        this.battleground[x][y] = BaseUnit;
        BaseUnit.setPosition(x, y);
    }
}
