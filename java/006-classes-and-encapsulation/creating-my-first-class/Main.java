public class Main {
    public static void main(String[] args) {
        /*
         * =================================
         * MY NOTES: CLASS vs. OBJECT
         * =================================
         *
         * ANALOGY: A cookie cutter.
         *
         * CLASS: The cookie cutter (`Car`). It's the template that defines the shape
         * and properties. It's not the cookie itself.
         *
         * OBJECT: The actual cookie (`myCar`). It's a real "instance" I create from
         * the class/template. I can make many unique objects from one class.
         *
         * Below, I'm creating objects from my `Car` class.
         */

        // Here I'm creating an "object" or "instance" from my Car class.
        Car myCar = new Car("Ford", "Mustang", 2022);

        // Another one
        Car yourCar = new Car("Toyota", "Corolla", 2023);

        // I can't access private fields directly: myCar.model = "Fiesta";
        // This is encapsulation! I must use public methods to interact with the object.
        myCar.displayInfo();
        yourCar.displayInfo();
        System.out.println();

        /*
         * =================================
         * STATIC Attributes
         * =================================
         *
         * ANALOGY: Back to the car blueprint (`Car` class).
         *
         * A `static` field is like a counter on the wall of the car factory itself,
         * labeled "Total Cars Built". This counter doesn't belong to any single car;
         * it belongs to the factory (the class) as a whole. Every time a new car is
         * built, the factory updates that one single counter.
         *
         * WHY NOT ACCESS VIA INSTANCE (e.g., `myCar.getCarCounter()`)?
         * It's misleading. It looks like I'm asking my specific Mustang for the
         * total number of cars ever built. It implies the value belongs to `myCar`,
         * but it's actually shared by ALL cars. The code will work, but it's bad practice.
         *
         * WHAT'S THE BETTER WAY?
         * Access it through the class itself: `Car.getCarCounter()`. This clearly shows
         * the information belongs to the `Car` factory/blueprint, not an individual car.
         *
         */

        // The correct, clear way to access a static member:
        System.out.println("Total cars manufactured (correct access): " + Car.getCarCounter());
    }
}