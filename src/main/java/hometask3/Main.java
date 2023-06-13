package hometask3;
//Создать список по аналогии LinkedList (список связанных элементов),
//        реализовать в нем iterable интерфейс.
//        Список должен содержать элементы со ссылкой на следующий элемент
//        (если показалось мало, то реализовать ссылку и на предыдущий элемент)

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("First Element");
        myLinkedList.add("Second Element");
        myLinkedList.add("Third Element");
        myLinkedList.add("Fourth Element");
        myLinkedList.add("Fifth Element");

        myLinkedList.addFirst("New Element");
        myLinkedList.addLast("New Last Element");

        for (String value: myLinkedList) {
            System.out.println(value);
        }
        System.out.println("-------------------");
        System.out.printf("Size of myLinkedList: %d\n", myLinkedList.size());
        String word = "Second Element";
        System.out.println("Is myLinkedList contains '" + word + "'?");
        System.out.println(myLinkedList.contains(word));

        System.out.println("-------------------");
        System.out.println("Remove element index 2");
        System.out.println(myLinkedList.remove(2));
        System.out.println("--------------------");
        System.out.println("Set element index 3");
        myLinkedList.set("The newest element", 3);
        System.out.println("--------------------");
        for (int i = 0; i < myLinkedList.size(); i++){
            System.out.println(myLinkedList.get(i));
        }
    }
}
