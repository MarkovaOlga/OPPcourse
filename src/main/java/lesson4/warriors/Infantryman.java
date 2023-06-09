package lesson4.warriors;

import lesson4.shields.Shield;
import lesson4.weapons.Weapon;

public class Infantryman extends Warrior {

    public Infantryman(String name, int healthPoint, Weapon weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
