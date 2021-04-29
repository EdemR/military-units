package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> theArmy = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        theArmy.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (int i = 0; i < theArmy.size(); i++) {
            theArmy.get(i).sufferDamage(damage);
            if (theArmy.get(i).getHitPoints() < 25) {
                theArmy.remove(i);
                i--;
            }
        }
    }

    public int getArmyDamage() {
        int allDamage = 0;

        for (MilitaryUnit unit : theArmy) {
            allDamage += unit.doDamage();
        }

        return allDamage;
    }

    public int getArmySize() {
        return theArmy.size();
    }
}