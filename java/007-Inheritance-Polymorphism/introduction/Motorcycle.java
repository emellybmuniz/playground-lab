// Motorcycle is another "child" of Vehicle.

public class Motorcycle extends Vehicle {

    // extends: This keyword indicates that Motorcycle is inheriting from the Vehicle class.
    // A trait specific to motorcycles.
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        // Again, calling the parent constructor. LOL
        super(brand, year);
        System.out.println("...and it's a Motorcycle!");
        this.hasSidecar = hasSidecar;
    }

    // This is an example of Method Overriding.
    // The parent (Vehicle) has a displayInfo() method, but I want a more specific
    // one for Motorcycle.
    @Override // This annotation tells Java I'm intentionally overriding a parent method.
    public void displayInfo() {
        System.out.println("Motorcycle Info: " + getYear() + " " + getBrand() + " | Has sidecar: " + hasSidecar);
    }
}