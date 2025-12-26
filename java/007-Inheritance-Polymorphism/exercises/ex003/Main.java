package ex003;

/* Write a class hierarchy for creating clocks for different places around the world. Define a parent class that has the properties Hour, Minute, and Second with their respective getters and setters (following the rules of how a clock works) and a method that should return the time in the format HH:MM:SS. From this class, create two implementations, one called American clock and the other called Brazilian clock, remembering that for the American clock there are no hours from 1 PM to 12 AM. Also define a method in the superclass that will be the responsibility of the class that extends it to define its operation. This method must receive a clock (regardless of the implementation) and extract the information from it and use it in the object that received it to set the new clock information. */

public class Main {
    public static void main(String[] args) {
        // Brazillian Clock (24-hour format) and American Clock (12-hour format)
        Clock brazilianClock = new BrazilianClock(22, 30, 45);
        Clock americanClock = new AmericanClock(22, 30, 45);

        System.out.println("Brazillian Clock:");
        brazilianClock.display();

        System.out.println("American Clock:");
        americanClock.display();

        // Simulate ticking
        brazilianClock.tick();
        americanClock.tick();

        System.out.println("After ticking:");
        System.out.println("Brazillian Clock:");
        brazilianClock.display();

        System.out.println("American Clock:");
        americanClock.display();
    }
    
}
