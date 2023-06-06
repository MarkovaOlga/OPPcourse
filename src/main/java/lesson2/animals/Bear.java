package lesson2.animals;

import lesson2.RunSpeed;
import lesson2.SwimSpeed;
import lesson2.animals.base.Predator;

public class Bear extends Predator implements RunSpeed, SwimSpeed {
    public Bear(String name) {
        super(name);
    }
    @Override
    public String sound(){
        return "Rear";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 40;
    }

    @Override
    public int getSwimSpeed() {
        return 6;
    }
}
