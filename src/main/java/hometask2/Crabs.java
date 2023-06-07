package hometask2;

public class Crabs extends ResidentOfAquarium implements NewSwimSpeed{
    public Crabs(String name) {
        super(name);
    }
    @Override
    public String feed() {
        return "молюски, корм для рыб";
    }
    @Override
    public int getNewSwimSpeed() {
        return 2;
    }

    public String toString() {
        return String.format("Краб: %s, Скорость плавания: %d", super.toString(), getNewSwimSpeed());
    }
}
