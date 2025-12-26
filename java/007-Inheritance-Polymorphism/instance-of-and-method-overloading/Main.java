public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Method Overloading Demonstration ---");
        
        // Create an instance of our utility class
        DataProcessor processor = new DataProcessor();

        // The compiler knows which 'process' method to call based on the arguments provided.
        // This is resolved at compile-time.
        processor.process("Hello, World!"); // Calls process(String)
        processor.process(12345);          // Calls process(int)
        processor.process(99.99);          // Calls process(double)
        processor.process("User-ID:", 789); // Calls process(String, int)

        System.out.println("\n--- 2. `instanceof` Demonstration ---");

        // Create an array of the base type, holding objects of different subclass types.
        Vehicle[] fleet = new Vehicle[3];
        fleet[0] = new Car("Toyota", 4);
        fleet[1] = new Motorcycle("Harley-Davidson", true);
        fleet[2] = new Car("Ford", 2);

        // We want to process each vehicle, but some actions are specific to the subclass.
        for (Vehicle v : fleet) {
            System.out.println("Processing vehicle: " + v.getBrand());
            v.startEngine(); // This is a common method, available in the base class.

            // Use `instanceof` to check the object's actual type at runtime.

            // **Classic `instanceof` approach:**
            // First, check the type. Second, explicitly cast it to use specific methods.
            if (v instanceof Car) {
                Car car = (Car) v; // Explicit cast
                System.out.println("   -> It's a car with " + car.getNumberOfDoors() + " doors.");
                car.openTrunk();
            }

            // **Modern `instanceof` with Pattern Matching (Java 16+)**
            // This is the preferred, modern way. It's more concise and safer.
            // It checks the type and creates a scoped, pre-cast variable in one step.
            if (v instanceof Motorcycle moto) {
                // 'moto' is a variable of type Motorcycle, ready to use. No extra cast needed.
                System.out.println("   -> It's a motorcycle.");
                moto.doWheelie();
            }
            System.out.println("--------------------");
        }
    }
}

/**
 * A utility class to demonstrate Method Overloading.
 */
class DataProcessor {
    /**
     * Method Overloading:
     * Multiple methods can have the same name as long as their parameter lists are different.
     * Differences can be in the number of parameters, the type of parameters, or both.
     * The return type is NOT part of the method signature for overloading.
     */

    // Method 1: processes a String
    public void process(String data) {
        System.out.println("Processing String: " + data);
    }

    // Method 2: processes an integer (overloaded)
    public void process(int data) {
        System.out.println("Processing int: " + data);
    }

    // Method 3: processes a double (overloaded)
    public void process(double data) {
        System.out.println("Processing double: " + data);
    }

    // Method 4: processes a String and an int (overloaded)
    public void process(String prefix, int data) {
        System.out.println("Processing " + prefix + " " + data);
    }
}

/**
 * A simple class hierarchy to demonstrate `instanceof`.
 */
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) { this.brand = brand; }
    public String getBrand() { return brand; }
    public void startEngine() { System.out.println("   Engine started."); }
}

final class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int doors) {
        super(brand);
        this.numberOfDoors = doors;
    }
    public int getNumberOfDoors() { return numberOfDoors; }
    public void openTrunk() { System.out.println("   Trunk is open."); }
}

final class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }
    public void doWheelie() { System.out.println("   Performing a wheelie! (Safely, of course)"); }
}