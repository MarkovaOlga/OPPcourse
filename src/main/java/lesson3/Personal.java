package lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User>{
    List<User> users = new ArrayList<>();

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index=0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }
    public Personal addUser(User user){
        users.add(user);
        return this;
    }
    public int size(){
        return users.size();
    }
    public List<User> toList(){
        List<User> results = new ArrayList<>();
        for (User user: this) {
            results.add(user);
        }
        return results;
    }
}
