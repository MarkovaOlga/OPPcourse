package hometask2;

public abstract class ResidentOfAquarium{
    protected String name;
    public ResidentOfAquarium(String name) {
        this.name = name;
    }
    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Имя: %s, Питание: %s",name, feed());
    }
}
