package hometask1;

public class DrinksWithAdditive extends Product {
    private String typeOfAdditive;
    private double volumeOfAdditive;

    public DrinksWithAdditive(String productName, int volume, int temperature, double productPrice, String typeOfAdditive, double volumeOfAdditive) {
        super(productName, volume, temperature, productPrice);
        this.typeOfAdditive = typeOfAdditive;
        this.volumeOfAdditive = volumeOfAdditive;
    }

    @Override
    public String toString() {
        return String.format("Кофе с добавками: %s, Вид добавки: %s, Вес добавки: %f", super.toString(),typeOfAdditive,volumeOfAdditive);
    }
}
