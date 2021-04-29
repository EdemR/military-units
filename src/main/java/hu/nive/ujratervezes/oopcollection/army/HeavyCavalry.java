package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{
    private boolean isFirstAttack;

    public HeavyCavalry() {
        this.hp = 150;
        this.damage = 20;
        this.haveArmor = true;
        this.isFirstAttack = true;
    }

    @Override
    public int doDamage() {
        if (isFirstAttack) {
            this.isFirstAttack = false;
            return this.damage * 3;
        } else {
            return super.doDamage();
        }
    }
}