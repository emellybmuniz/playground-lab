// This is the "Parent" class.
// A general "blueprint" for any vehicle.
public class Vehicle {

    // All vehicles have a brand and a year. These are the "family traits".
    private String brand;
    private int year;

    // A constructor to create a new Vehicle.
    public Vehicle(String brand, int year) {
        System.out.println("A Vehicle is being created...");
        this.brand = brand;
        this.year = year;
    }

    // A general behavior that all vehicles share.
    public void startEngine() {
        System.out.println("The vehicle's engine starts. Vroommm!");
    }

    // Another general behavior.
    public void displayInfo() {
        System.out.println("Vehicle Info: " + year + " " + brand);
    }

    // --- Getters ---
    // allows other classes to access informations safely 
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}