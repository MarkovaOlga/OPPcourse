package lesson3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan","Ivanov", 21))
                .addUser(new User("Petr","Petrov",25))
                .addUser(new User("Irina", "Semenova", 18))
                .addUser(new User("Anton", "Krasnov", 30))
                .addUser(new User("Anton", "Krasnov", 20));
        Personal personal2 = new Personal();
        personal2.addUser(new User("Tatiana", "Samoilova",32));
        User user = new User("Elena","Sovkova",45);
        user.setSubordinate(personal);

        personal2.addUser(user);
        User bigBoss = new User("Boss","Bossov", 44);
        bigBoss.setSubordinate(personal2);

        Company company = new Company(bigBoss);
        for (User subordinates: company) {
            System.out.println(subordinates);
        }
//        for (User user: personal) {
//            System.out.println(user);
//        }
//        for (int ni =0; i<personal.users.size(); i++){
//            System.out.println(personal.users.get(i));
//        }
//        List<User> users = personal.toList();
//        System.out.println("--------------------");
//        System.out.println(users);
//        System.out.println("--------------------");
//        Collections.sort(users);
//        System.out.println(users);

    }
}
