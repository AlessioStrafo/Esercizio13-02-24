

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime user1Date = OffsetDateTime.parse("1991-10-08T00:00:00Z");
        OffsetDateTime user2Date = OffsetDateTime.parse("1997-11-08T00:00:00Z");

        User user1 = new User(1,"Alessio",user1Date);
        User user2 = new User(2,"Marco",user2Date);
        Working space = new Working();
        space.addUser(user1);
        space.addUser(user2);
        space.printUsers();

        System.out.println(space.findUserById(2));
        System.out.println(space.findUserByName("Alessio"));
    }
}