package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    protected int hp;
    protected int damage;
    protected boolean haveArmor;

    public int doDamage() {
        return this.damage;
    }

    public void sufferDamage(int damage) {
        if (!this.haveArmor) {
            this.hp -= damage;
        } else {
            this.hp -= damage / 2;
        }
    }

    public int getHitPoints() {
        return this.hp;
    }
}
