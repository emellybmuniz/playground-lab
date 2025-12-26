// The "extends" keyword is how we say: "Car is a child of Vehicle".
// So, Car inherits from Vehicle.
public class Car extends Vehicle {

    // This is a trait specific to a Car, not all vehicles have it.
    private int numberOfDoors;

    // The constructor for the Car.
    public Car(String brand, int year, int numberOfDoors) {
        // "super" calls the constructor of the parent class (Vehicle).
        // It's like saying, "Hey Dad (Vehicle), please set up the brand and year for me."
        super(brand, year);
        System.out.println("...and it's a Car!");
        this.numberOfDoors = numberOfDoors;
    }

    // This is a behavior specific to a Car.
    public void honk() {
        System.out.println("Beep beep!");
    }

    // Let's override the displayInfo method for the Car too.
    @Override
    public void displayInfo() {
        // We can even call the parent's method first if we want!
        System.out.println("Car Info: " + getYear() + " " + getBrand() + " | Doors: " + numberOfDoors);
    }
}