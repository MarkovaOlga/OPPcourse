package lesson2.animals;

import lesson2.FlySpeed;
import lesson2.RunSpeed;
import lesson2.animals.base.Bird;

public class Owl extends Bird implements FlySpeed, RunSpeed {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Ух-уух";
    }

    @Override
    public String feed() {
        return "мышки, грызуны";
    }

    @Override
    public int getFlySpeed() {
        return 90;
    }

    @Override
    public int getRunSpeed() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Owl: %s, Speed: %d, FlySpeed: %d, RunSpeed: %d", super.toString(), getRunSpeed(), getFlySpeed(),getRunSpeed());
    }
}
