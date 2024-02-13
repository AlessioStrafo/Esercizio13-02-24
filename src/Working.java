import java.util.ArrayList;
import java.util.List;

public class Working {
    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }
    public void printUsers(){
        System.out.println(users);
    }
}
