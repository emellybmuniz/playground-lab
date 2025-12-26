/**
 * Represents a pet washing machine for a pet shop, with controlled operations and resource management.
 * 
 * Supported Operations:
 * - Wash the pet
 * - Refill water (by 2 liters per operation)
 * - Refill shampoo (by 2 liters per operation)
 * - Check current water level
 * - Check current shampoo level
 * - Check if a pet is currently inside the machine
 * - Place a pet into the machine
 * - Remove a pet from the machine
 * - Clean the machine (required if pet removed without being washed)
 * 
 * Implementation Rules:
 * - Only one pet is allowed in the machine at a time.
 * - Each completed wash consumes:
 *     - 10 liters of water
 *     - 2 liters of shampoo
 * - Machine maximum capacities:
 *     - Water: 30 liters
 *     - Shampoo: 10 liters
 * - If a pet is removed WITHOUT being washed, the machine must be cleaned before another pet can enter.
 * - Cleaning the machine consumes:
 *     - 3 liters of water
 *     - 1 liter of shampoo
 * - Water and shampoo refill operations add exactly 2 liters per activation (cannot exceed max capacity).
 */

package ex003;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            WashingMachine machine = new WashingMachine();
            System.out.println("Washing machine created successfully!");
            interactiveMenu(machine, scanner);
        }
    }

    public static void interactiveMenu(WashingMachine machine, Scanner scanner) {
            int option = 0;
            do {
                System.out.println("\n--- Pet Washing Machine Control Menu ---");
                System.out.println("1. Wash Pet (costs 10L water, 2L shampoo)");
                System.out.println("2. Refill Water (2L)");
                System.out.println("3. Refill Shampoo (2L)");
                System.out.println("4. Check Water Level");
                System.out.println("5. Check Shampoo Level");
                System.out.println("6. Check if Pet is Inside");
                System.out.println("7. Place Pet Inside");
                System.out.println("8. Remove Pet");
                System.out.println("9. Clean Machine (costs 3L water, 1L shampoo)");
                System.out.println("10. Exit");
                System.out.print("Choose an option: ");
                
                option = scanner.nextInt();
                
                switch (option) {
                    case 1:
                        machine.washPet();
                        break;
                    case 2:
                        machine.refillWater();
                        break;
                    case 3:
                        machine.refillShampoo();
                        break;
                    case 4:
                        System.out.println("Current water level: " + machine.getWaterLevel() + " liters");
                        break;
                    case 5:
                        System.out.println("Current shampoo level: " + machine.getShampooLevel() + " liters");
                        break;
                    case 6:
                        System.out.println(machine.isPetInside() ? "Yes. Pet is inside." : "No pet inside.");
                        break;
                    case 7:
                        machine.placePetInside();
                        break;
                    case 8:
                        machine.removePet();
                        break;
                    case 9:
                        machine.cleanMachine();
                        break;
                    case 10:
                        System.out.println("Exiting program. Goodbye! :)");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (option != 10);
    }
}