/**
 * =======================================================================================
 * CONCEPT: ENCAPSULATION (Explained by Gemini)
 * =======================================================================================
 *
 * ANALOGY: Think of a car.
 *
 * As a driver, you interact with the car through a simple interface: a steering wheel,
 * pedals, and a gear stick. You don't need to know the complex details of how the
 * engine, transmission, or electronics work internally.
 *
 * The car's internal mechanics are "encapsulated" or hidden away. This has two main benefits:
 * 1. Simplicity: You can drive any car because the interface is standard and easy to use.
 * 2. Safety/Protection: You can't accidentally mess up the engine's timing or the fuel
 *    injection system while driving. The car's internal state is protected.
 *
 * IN PROGRAMMING: Encapsulation means bundling the data (attributes/fields) and the
 * methods (behaviors) that operate on that data into a single unit, which is the "class".
 *
 * We achieve this by:
 * 1. Making the data `private`: This is like hiding the engine. It prevents code outside
 *    the class from directly accessing or modifying the data.
 * 2. Providing `public` methods (known as "getters" and "setters"): This is your public
 *    interface (the steering wheel and pedals). These methods provide controlled access
 *    to the private data. You can add logic inside them, for example, to validate data
 *    before changing it.
 */
public class Car {

    // These are the attributes (data) of a Car.
    // They are marked as `private`, which means they are "encapsulated".
    // Only the code inside this Car class can access them directly.
    private String make;
    private String model;
    private int year;
    private static int carCounter = 0;

    // This is a "constructor". It's a special method used to create a new Car object.
    // It initializes the object's state (its attributes).
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        carCounter++;
    }

    // --- PUBLIC INTERFACE (Getters and Setters) ---

    // This is a "getter" method. It allows outside code to safely READ the `make` attribute.
    public String getMake() {
        return make;
    }

    // This is a "getter" for the model.
    public String getModel() {
        return model;
    }

    // This is a "getter" for the year.
    public int getYear() {
        return year;
    }

    // This is a "setter" method. It allows outside code to safely MODIFY the `year` attribute.
    // We could add validation here, e.g., if (year > 1886) { ... }
    public void setYear(int year) {
        this.year = year;
    }

    // This is a regular public method that describes the car.
    // It uses the class's own private data.
    public void displayInfo() {
        System.out.println("Car Info: " + year + " " + make + " " + model);
    }

    public static int getCarCounter() {
        return carCounter;
    }
}