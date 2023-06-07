package hometask2;
import hometask2.NewSwimSpeed;
import hometask2.Aquarium;

//Написать аквариум, или террариум по аналогии с зоопарком. Добавить интерфейс - скорость плавания

public class Main {
    public static void main(String[] args) {
        ResidentOfAquarium guppi = new Guppi("Малышка");
        ResidentOfAquarium ternetia = new Ternetia("Шустрик");

        Aquarium aquarium = new Aquarium();
        aquarium.addResidentOfAquarium(guppi).addResidentOfAquarium(ternetia)
                .addResidentOfAquarium(new Crabs("Говард")).addResidentOfAquarium(new Snails("Бобби"));
        System.out.println(aquarium);
        NewSwimSpeed champ = aquarium.getBestSwimmer();
        System.out.println("---Лучший в плавании---");
        System.out.println(champ);
        System.out.println("-----Плавают-----");
        for (NewSwimSpeed swimmer: aquarium.swimmers()) {
            System.out.println(swimmer);
        }
    }
}
