package lesson1;

public class Main {
    public static void main(String[] args) {
        VendingMachine apparat = new VendingMachine();
        apparat.addProduct(new Chocolate("Alpen Gold",10, "темный", "с орехом", 500))
                .addProduct(new Product("яблоко", 20))
                .addProduct(new Product("Кола", 15))
                .addProduct(new Cheese("Российский", 10, "вкусный", 1000));
//        for (Product propuct: apparat.getVending()) {
//            System.out.println(propuct);
//        }
        System.out.println(apparat);
        Product founded = apparat.findProduct("яблоко");
        System.out.println(founded);
        System.out.println("-------------------");
        Product soldProduct = apparat.saleProduct("яблоко");
        System.out.println(soldProduct);
        Product soldProduct2 = apparat.saleProduct("Кола");
        System.out.println(soldProduct2);
        System.out.println("Осталось денег: ");
        System.out.println(apparat.getCash());
        System.out.println(apparat);
    }
}
