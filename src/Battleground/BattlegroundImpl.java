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

    private BaseUnit[][] battleground;

    
    //Constructor
    public BattlegroundImpl(){
        this.battleground = new BaseUnit[5][5];
    }

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
        System.out.printf("%s has been added to the battleground with the coordinates of %d, %d!\n",
                BaseUnit.getName(), BaseUnit.getPositionX(), BaseUnit.getPositionY());
        this.battleground[BaseUnit.getPositionX()][BaseUnit.getPositionY()]
                = BaseUnit;
    }

    @Override
    public void remove(BaseUnit BaseUnit) {
        System.out.printf("%s has been deleted from the battleground!\n",
                BaseUnit.getName());
        this.battleground[BaseUnit.getPositionX()][BaseUnit.getPositionY()] = 
                null;
        BaseUnit = null;
        
    }

    @Override
    public void move(BaseUnit BaseUnit, int x, int y) {
        this.battleground[BaseUnit.getPositionX()][BaseUnit.getPositionY()] = 
                null;
        this.battleground[x][y] = BaseUnit;
        BaseUnit.setPosition(x, y);
        System.out.printf("%s has been moved to %d, %d!\n",
                BaseUnit.getName(), BaseUnit.getPositionX(),
                BaseUnit.getPositionY());
    }
}
