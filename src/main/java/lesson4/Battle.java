package lesson4;

import lesson4.shields.Shield;
import lesson4.warriors.Warrior;
import lesson4.weapons.Weapon;

public class Battle {
    private Warrior w1;

    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }
    public void fight(){
        while(w1.getHealthPoint()>0 && w2.getHealthPoint()> 0){
            int damage1 = w1.hit();
            int shield1 = w1.protect();

            System.out.println("First hit second : " + damage1 + " shield: " + shield1);
            w2.rediceHelth(damage1, shield1);
            int damage2 = w2.hit();
            int shield2 = w2.protect();
            System.out.println("Second hit first : " + damage2 + " shield: " + shield2);
            w1.rediceHelth(damage2, shield2);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}
