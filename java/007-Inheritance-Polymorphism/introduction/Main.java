import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // I can treat a Car AS A Vehicle.
        Vehicle myCar = new Car("Ford", 2021, 4);

        // And I can treat a Motorcycle AS A Vehicle.
        Vehicle myMotorcycle = new Motorcycle("Harley-Davidson", 2019, false);

        // This is the magic of polymorphism. :) 
        // I'm creating a list of the PARENT type.
        List<Vehicle> myGarage = new ArrayList<>();

        // But I can add children to it, because a Car IS A Vehicle, and a Motorcycle IS A Vehicle.
        myGarage.add(myCar);
        myGarage.add(myMotorcycle);
        myGarage.add(new Car("Honda", 2023, 2));

        System.out.println("\n--- Iterating through my garage ---");
        for (Vehicle v : myGarage) {
            // Ccalling the generic startEngine() method.
            v.startEngine();
            // Dynamic Method Dispatch or Late Binding:
            // Even though my loop variable 'v' is of type Vehicle, Java knows the
            // ACTUAL object's type at runtime and calls the CORRECT overridden method.
            v.displayInfo();
            
            // v.honk(); // This will cause a compile-time error because Vehicle doesn't have honk() method.
            System.out.println("--------------------");
        }
    }
}