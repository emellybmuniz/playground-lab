/**
 * Represents a car with controllable functions and strict operational rules.
 * 
 * The car supports the following operations:
 * - Start the engine
 * - Turn off the engine
 * - Accelerate (+1 km/h)
 * - Decelerate (-1 km/h)
 * - Turn left or right
 * - Check current speed
 * - Change gear (up or down)
 * 
 * Implementation Rules:
 * - On creation, the car starts turned off, in neutral gear (gear 0), and speed = 0 km/h.
 * - A turned-off car cannot perform any function.
 * - Accelerating increases speed by 1 km/h (max 120 km/h).
 * - Decelerating decreases speed by 1 km/h (min 0 km/h).
 * - The car has 6 forward gears (1-6) + neutral (gear 0). Gear skipping is not allowed.
 * - Speed must respect gear limits:
 *     Gear 0 (Neutral): Cannot accelerate (speed must remain 0)
 *     Gear 1: 0-20 km/h
 *     Gear 2: 21-40 km/h
 *     Gear 3: 41-60 km/h
 *     Gear 4: 61-80 km/h
 *     Gear 5: 81-100 km/h
 *     Gear 6: 101-120 km/h
 * - The car can only be turned off when in neutral (gear 0) and speed is 0 km/h.
 * - Turning (left/right) is only allowed when speed is between 1 km/h and 40 km/h (inclusive).
 */
package ex002;

 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Car car = new Car();
            System.out.println("Car created successfully!");
            interactiveMenu(car, scanner);
        }
    }

    private static void interactiveMenu(Car car, Scanner scanner) {
        int option = 0;
        do {
            System.out.println("\n--- Car Control Menu ---");
            System.out.println("1. Start Engine");
            System.out.println("2. Turn Off Engine");
            System.out.println("3. Accelerate");
            System.out.println("4. Decelerate");
            System.out.println("5. Turn Left");
            System.out.println("6. Turn Right");
            System.out.println("7. Change Gear Up");
            System.out.println("8. Change Gear Down");
            System.out.println("9. Check Current Status");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println(car.startEngine());
                    break;
                case 2:
                    System.out.println(car.turnOffEngine());
                    break;
                case 3:
                    System.out.println(car.accelerate());
                    break;
                case 4:
                    System.out.println(car.decelerate());
                    break;
                case 5:
                    System.out.println(car.turnLeft());
                    break;
                case 6:
                    System.out.println(car.turnRight());
                    break;
                case 7:
                    System.out.println(car.changeGearUp());
                    break;
                case 8:
                    System.out.println(car.changeGearDown());
                    break;
                case 9:
                    System.out.println(car.checkStatus());
                    break;
                case 10:
                    System.out.println("Exiting program. Goodbye! :)");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 10.");
                    break;
            }
            
        } while (option != 10);
    }
}
