import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // list to store users
        List<User> userList = new ArrayList<>();

        // adding users
        userList.add(new User("Charlie", 35, SexEnum.MALE));
        userList.add(new User("Diana", 28, SexEnum.FEMALE));
        userList.add(new User("Alice", 30, SexEnum.FEMALE));
        userList.add(new User("Bob", 25, SexEnum.MALE));
        userList.add(new User("Eve", 22, SexEnum.FEMALE)); // the most recent

        System.out.println("--- All Users ---");
        userList.forEach(u -> System.out.println("User: " + u.name() + ", Age: " + u.age() + ", Sex: " + u.sex()));
        System.out.println();

        // --- 2. Show the 3 most recent users ---
        System.out.println("--- 3 Most Recent Users ---");
        userList.stream()
                .skip(Math.max(0, userList.size() - 3))
                .forEach(u -> System.out.println("Recent User: " + u.name() + ", Age: " + u.age() + ", Sex: " + u.sex()));
    }
}
