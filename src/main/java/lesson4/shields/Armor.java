package lesson4.shields;

public class Armor implements Shield{
    @Override
    public int protection() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Armor: %d", protection());
    }
}
