import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Functional Interfaces.

        // Let's start with a simple list of things to do
        List<String> myTasks = new ArrayList<>();
        myTasks.add("Write code");
        myTasks.add("Learn about Lambdas");
        myTasks.add("Drink coffee");

        // --- The Concept: A Contract for a Single Action ---
        // I want to perform an action on each item in my list. The `forEach` method
        // is perfect for this. It asks for a 'Consumer'
        // A 'Consumer' is a built-in Functional Interface in Java
        // I think of it like a contract that says: "You must provide me with one
        // single action that accepts an item and returns nothing"
        // This single action is defined by its single abstract method: `void accept(T t);`

        // --- The "Old Way" (before Lambdas) using an Anonymous Inner Class ---
        // To fulfill the 'Consumer' contract, I used to have to create a whole new
        // object on the spot. It's quite verbose for a simple task

        /*
        System.out.println("--- Printing with an Anonymous Class ---");
        myTasks.forEach(new Consumer<String>() {
            @Override
            public void accept(String task) {
                // This is the implementation of the single abstract method
                System.out.println("Task: " + task);
            }
        });
        */

        // --- The "New Way" with a Lambda Expression ---
        // A lambda is a shortcut. It's amazing :) 
        // Since Java knows `forEach` needs a `Consumer`, and a `Consumer` only has ONE
        // method to implement (`accept`), I don't need all the ceremony
        // I can just provide the implementation for that one method directly

        // The lambda `task -> System.out.println("Task: " + task)` can be read as:
        // 'task'   -> "For the item that you will give me (let's call it 'task')..."
        // '->'     -> "...I want you to perform this action..."
        // 'System.out.println(...)' -> "...print it to the console"

        System.out.println("\n--- Printing with a Lambda Expression ---");
        myTasks.forEach(task -> System.out.println("Task: " + task));

        // The result is the same, but the code is so much cleaner and easier to read now
    }
}
