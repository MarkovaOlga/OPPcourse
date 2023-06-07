package hometask2;

public class Fish extends ResidentOfAquarium{
    public Fish(String name) {
        super(name);
    }
    @Override
    public String feed() {
        return "водоросли, корм";
    }
}
