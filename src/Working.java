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

    public void removeUser(User user) {
        users.remove(user);
    }

    public boolean removeUserById(int id) {
        boolean found = false;
        for(User user: users) {
            if(user.getId() == id) {
                users.remove(user);
                found = true;
            }
        }
        return found;
    }

    public User findUserById(int id) {
        User foundUser = null;
        for(User user: users) {
            if(user.getId() == id) {
                foundUser = user;
            }
        }
        return foundUser;
    }

    public User findUserByName(String name) {
        User foundUser = null;
        for(User user: users) {
            if(user.getNome().equals(name)) {
                foundUser = user;
            }
        }
        return foundUser;
    }
}
