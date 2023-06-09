package lesson4;

import lesson4.warriors.Archer;
import lesson4.warriors.Infantryman;
import lesson4.warriors.Warrior;
import lesson4.weapons.meleeWeapon.Axe;
import lesson4.weapons.meleeWeapon.Sword;
import lesson4.weapons.rangedWeapon.Bow;
import lesson4.weapons.rangedWeapon.CrossBow;
//        На основе работы на уроке.
//        Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов.
//        Реструктуризировать код в конечных классах семейства Warriors.
//        Добавить метод определения минимального щита члена команды в команде.
//        * Продумать, как можно сделать воина без щита.
public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("John",150, new Axe()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow()));
        teamArchers.add(new Archer("Peter", 100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword()));
        System.out.println(team1);
        System.out.println("---------------");
        System.out.println(teamArchers);
        System.out.println("---------------");
        System.out.println(teamInfantryman);

        Battle<Axe, Bow> battle1 = new Battle<>(new Infantryman("John",150, new Axe()),
                (new Archer("Robin", 100, new Bow())));
        battle1.fight();
    }
}
