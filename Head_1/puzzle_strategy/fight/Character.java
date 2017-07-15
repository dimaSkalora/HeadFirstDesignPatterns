package puzzle_strategy.fight;

import puzzle_strategy.weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;
    abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weapon = weaponBehavior;
    }
}
