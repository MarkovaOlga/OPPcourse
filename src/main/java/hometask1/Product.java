package hometask1;

public class Product {


    private String productName;
    private int volume;
    private int temperature;
    private double productPrice;

    public Product(String productName, int volume, int temperature, double productPrice) {
        this.productName = productName;
        this.volume = volume;
        this.temperature = temperature;
        this.productPrice = productPrice;
    }
    @Override
    public String toString() {
        return String.format("Напиток: %s, объём: %d, темпаратура: %d, цена: %f", productName,volume,temperature,productPrice);
    }
    public String getProductName() {
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
}
