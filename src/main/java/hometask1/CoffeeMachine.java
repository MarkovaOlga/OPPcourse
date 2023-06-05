package hometask1;
import lesson1.VendingMachine;

import java.util.List;
import java.util.ArrayList;

public class CoffeeMachine {
    private List<Product> coffeeMachine=new ArrayList<>();
    private double cash = 0;
    public CoffeeMachine addProduct(Product prod) {
        coffeeMachine.add(prod);
        return this;
    }
    public Product findProduct(String name) {
        for (Product product: coffeeMachine) {
            if (name.equals((product.getProductName()))){
                return product;
            }
        }
        return null;
    }
    public double getCash() {
        return cash;
    }
    public Product saleProduct(String nameProd){
        Product found = findProduct(nameProd);
        if (found != null) {
            cash=cash+ found.getProductPrice();
            coffeeMachine.remove(found);
        }
        return found;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в кофемашине: ").append(cash).append("\n");
        for (Product product: coffeeMachine) {
            builder.append(product).append("\n");
        }
        return builder.toString();
    }
}
