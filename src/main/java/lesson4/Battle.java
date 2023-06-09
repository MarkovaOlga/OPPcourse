package lesson4;

import lesson4.warriors.Warrior;
import lesson4.weapons.Weapon;

public class Battle<W1 extends Weapon, W2 extends Weapon> {
    private Warrior<W1> w1;
    private Warrior<W2> w2;
    public Battle(Warrior<W1> w1, Warrior<W2> w2) {
        this.w1 = w1;
        this.w2 = w2;
    }
    public void fight(){
        while(w1.getHealthPoint()>0 && w2.getHealthPoint()> 0){
            int damage1 =w1.hit();
            System.out.println("First hit second : " + damage1);
            w2.rediceHelth(damage1);
            int damage2 = w2.hit();
            System.out.println("Second hit first : " + damage2);
            w1.rediceHelth(damage2);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}
