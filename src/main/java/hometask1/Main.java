package hometask1;

//Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные:
//        наименование, объем, температура, цена. Проинициализировать несколько напитков в классе main и торговый автомат,
//        воспроизвести логику продажи напитков. Сделать согласно принципам ООП, пройденным на семинаре.

public class Main {
    public static void main(String[] args) {

        CoffeeMachine apparat = new CoffeeMachine();
        apparat.addProduct(new Product("Эспрессо", 80, 90, 100))
                .addProduct(new Product("Американо", 120, 85, 110))
                .addProduct(new Product("Каппучино",250, 80, 150))
                .addProduct(new Product("Латте", 250, 80, 150))
                .addProduct(new Product("Маккиато", 250, 80, 160))
                .addProduct(new DrinksWithAdditive("Раф кофе", 300, 75, 170, "сироп", 10));

        System.out.println(apparat);
        System.out.println("--------------------------");
        Product soldProduct = apparat.saleProduct("Каппучино");
        System.out.println(soldProduct);
        Product soldProduct2 = apparat.saleProduct("Раф кофе");
        System.out.println(soldProduct2);
        System.out.println("Осталось денег: ");
        System.out.println(apparat.getCash());
        System.out.println(apparat);
    }
}
