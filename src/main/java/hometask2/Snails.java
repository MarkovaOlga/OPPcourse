package hometask2;

public class Snails extends ResidentOfAquarium{
    public Snails(String name) {
        super(name);
    }
    @Override
    public String feed() {
        return "органический нарост на стене, корм";
    }

    public String toString() {
        return String.format("Улитка: %s", super.toString());
    }
}
