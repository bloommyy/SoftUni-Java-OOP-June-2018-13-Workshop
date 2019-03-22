/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battleground;

import Unit.BaseUnit;
import java.util.List;

/**
 *
 * @author user
 */
public interface Battleground {

    public List<BaseUnit> getUnitsInRange(int x, int y);

    public void add(BaseUnit BaseUnit);

    public void remove(BaseUnit BaseUnit);

    public void move(BaseUnit BaseUnit, int x, int y);
}
