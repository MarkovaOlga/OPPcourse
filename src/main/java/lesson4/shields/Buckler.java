package lesson4.shields;

public class Buckler implements Shield{
    @Override
    public int protection() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("Buckler: %d", protection());
    }
}
