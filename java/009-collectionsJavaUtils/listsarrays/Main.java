import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // This program prints each item in a list of strings.
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "cherry", "bluberry");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("-----");

        //testingNewList();
        //otherList();
        //arraySize();
        //LinkedListExample();
        //listFromUser();
        //VectorExample();
        listWithClasses();
    }

    @SuppressWarnings({ "rawtypes", "unchecked", "unused" }) // Suppress warnings
    private static void testingNewList() {
        List test = new java.util.ArrayList();
        test.add("item1");
        test.add(false);
        test.add("item2");
        test.add(123);
        test.add(45.67);
        System.out.println(test);
        // search for implementation of List interface
    }

    @SuppressWarnings("unused")
    private static void otherList() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @SuppressWarnings("unused")
    private static void arraySize() {
        int[] codes = new int[2]; // Array with fixed size
        codes[0] = 123;
        codes[1] = 456;
        // code[2] = 789; -> This will cause an ArrayIndexOutOfBoundsException
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }
    }

    @SuppressWarnings("unused")
    private static void listFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items (type 'exit' to finish):");
        List<String> userList = new java.util.ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            userList.add(input);
        }
        System.out.println("You entered:");
        for (String item : userList) {
            System.out.println(item);
        }
        scanner.close();
    }

    // Linked list it's another implementation of List interface
    @SuppressWarnings("unused")
    private static void LinkedListExample() {
        List<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }

    @SuppressWarnings("unused")
    private static void VectorExample() {
        List<String> vector = new java.util.Vector<>();
        vector.add("one");
        vector.add("two");
        vector.add("three");
        for (String item : vector) {
            System.out.println(item);
        }
    }

    // Define a simple User class for demonstration
    static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            User user = (User) obj;
            return id == user.id && name.equals(user.name);
        }
    }

    private static void listWithClasses() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John"));
        users.add(new User(2, "Jane"));
        users.add(new User(3, "Doe"));
        for (User u : users) {
            System.out.println(u.getName());
        }
    }

    // Interesting Properties of Lists:
        // add: You can add elements to a list using the add() method.
        // isEmpty: You can check if a list is empty using the isEmpty() method.
        // clear: You can remove all elements from a list using the clear() method.
        // contains: You can check if a list contains a specific element using the
        // contains() method.
        // indexOf and lastIndexOf: You can find the index of the first or last
        // occurrence of an element using indexOf() and lastIndexOf() methods.
        // get: You can retrieve an element at a specific index using the get() method.
        // remove: You can remove an element at a specific index or by value using the
        // remove() method.
        // set: You can replace an element at a specific index using the set() method.
        // getLast and getFirst: In a LinkedList, you can retrieve the first and last
        // elements using getFirst() and getLast() methods.
        // addFirst and addLast: In a LinkedList, you can add elements to the beginning
        // or end of the list using addFirst() and addLast() methods.
        // toArray: You can convert a list to an array using the toArray() method.
        // size: You can get the number of elements in a list using the size() method.
        // sort: You can sort the elements in a list using the sort() method.
        // reverse: You can reverse the order of the elements in a list using the
        // reverse() method
}