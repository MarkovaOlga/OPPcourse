package lesson4.warriors;

import lesson4.shields.Shield;
import lesson4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weapon weapon;
    private Shield shield;
    public Warrior(String name, int healthPoint, Weapon weapon, Shield shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public int hit(){
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0, weapon.damage() + 1);

        return hitDamage;
    }
    public int protect(){
        Random rnd = new Random();
        int protectFromDamage = rnd.nextInt(0, shield.protection() + 1);
        return protectFromDamage;
    }
    public void rediceHelth(int damage, int shield) {
        int newDamage = 0;
        if(damage > shield) {
            newDamage = damage - shield;
        }
        healthPoint -= newDamage;
        if (healthPoint < 0){
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, Shield: %s, HealthPoint: %d", name, weapon, shield, healthPoint);
    }
}
