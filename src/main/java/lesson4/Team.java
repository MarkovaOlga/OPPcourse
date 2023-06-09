package lesson4;

import lesson2.RunSpeed;
import lesson2.animals.base.Animal;
import lesson4.shields.Shield;
import lesson4.warriors.Archer;
import lesson4.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T>{
    private List <T> team = new ArrayList<>();
    public void add(T element) {
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }
    public int getTeamHealth(){
        int teamHealth = 0;
        for (T t:this) {
            teamHealth+=t.getHealthPoint();
        }
        return teamHealth;
    }
    public int getTeamShield(){
        int teamShield = 0;
        for (T t: this){
            teamShield+=t.getShield().protection();
        }
        return teamShield;
    }
    public int maxAttackDistance () {
        int maxDistance = 0;
        for (T t: this){
            if (!(t instanceof Archer)){
                continue;
            }
            int currentDistance =((Archer) t).distance();
            if (maxDistance<currentDistance){
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }
    public int getTeamAttack() {
        int teamAttack = 0;
        for (T t:this) {
            teamAttack+=t.getWeapon().damage();
        }
        return teamAttack;
    }

    public T getMinRangeOfShield(){
        T minShield = team.get(0);
        for (T t: this) {
            if (minShield.getShield().protection() > t.getShield().protection()) {
                minShield = t;
            }
        }
        return minShield;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t:this) {
            builder.append(t).append("\n");
        }
        builder.append(String.format("TeamAttack: %d ", getTeamAttack()));
        builder.append(String.format("TeamHealth: %d ", getTeamHealth()));
        builder.append(String.format("TeamRanged: %d ", maxAttackDistance()));
        builder.append(String.format("TeamShield: %d ", getTeamShield()));
        return builder.toString();
    }
}
