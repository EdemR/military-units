package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{
    private boolean haveShield;

    public Swordsman(boolean haveArmor) {
        this.hp = 100;
        this.damage = 10;
        this.haveArmor = haveArmor;
        this.haveShield = true;
    }

    @Override
    public void sufferDamage(int damage) {
        if (this.haveShield) {
            this.haveShield = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}