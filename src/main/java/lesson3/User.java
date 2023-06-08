package lesson3;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;
    private Personal subordinate;
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setSubordinate(Personal subordinate) {
        this.subordinate = subordinate;
    }

    public Personal getSubordinate() {
        return subordinate;
    }

    @Override
    public String toString() {
        return String.format("\nFirstname: %s, lastname: %s, age: %d", firstName,lastName,age);
    }

    @Override
    public int compareTo(User o) {
//        if (this.age<o.age){
//            return -1;
//        } else if(this.age> o.age){
//            return 1;
//        } else return 0;
        int compareNames = this.firstName.compareTo(o.firstName);
        if (compareNames != 0) return compareNames;
        int compareLastNames = this.lastName.compareTo(o.lastName);
        if (compareLastNames != 0) return compareLastNames;
        return this.age - o.age;
    }
}
