package lesson4.shields;

public class Hauberk implements Shield{
    @Override
    public int protection() {
        return 8;
    }
    @Override
    public String toString() {
        return String.format("Hauberk: %d", protection());
    }
}
