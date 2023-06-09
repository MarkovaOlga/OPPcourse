package lesson4.warriors;

import lesson4.shields.Shield;
import lesson4.weapons.Weapon;
import lesson4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior{
    public Archer(String name, int healthPoint, Ranged weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }
    public int distance(){
        return ((Ranged)super.getWeapon()).distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
    }
}
