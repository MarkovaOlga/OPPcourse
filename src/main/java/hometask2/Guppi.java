package hometask2;

public class Guppi extends Fish implements NewSwimSpeed{
    public Guppi(String name) {
        super(name);
    }

    @Override
    public int getNewSwimSpeed() {
        return 3;
    }

    public String toString() {
        return String.format("Гуппи: %s, Скорость плавания: %d", super.toString(), getNewSwimSpeed());
    }
}
