package hometask2;

public class Ternetia extends Fish implements NewSwimSpeed{
    public Ternetia(String name) {
        super(name);
    }

    @Override
    public int getNewSwimSpeed() {
        return 5;
    }

    public String toString() {
        return String.format("Тернеция: %s, Скорость плавания: %d", super.toString(), getNewSwimSpeed());
    }
}
