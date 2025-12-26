/*
 3. Write a program where the user enters a first number, then a second number greater than the first, and chooses between even or odd. Based on this choice, the program must display all even or odd numbers (according to the initial selection) in the range of numbers provided, including the entered numbers, in descending order;
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
 
        int num2;
        do {
            System.out.print("Enter a second number greater than the first: ");
            num2 = sc.nextInt();
            if (num2 <= num1) {
                System.out.println("Invalid input. The second number must be greater than the first.");
            }
        } while (num2 <= num1);
 
        // Consume the leftover newline character from the previous sc.nextInt() call.
        sc.nextLine();
 
        String choice;
        do {
            System.out.print("Choose between 'even' or 'odd': ");
            choice = sc.nextLine().trim().toLowerCase();
            if (!choice.equals("even") && !choice.equals("odd")) {
                System.out.println("Invalid choice. Please enter 'even' or 'odd'.");
            }
        } while (!choice.equals("even") && !choice.equals("odd"));
 
        System.out.println("\nDisplaying " + choice + " numbers from " + num2 + " down to " + num1 + ":");
 
        for (int i = num2; i >= num1; i--) {
            if (choice.equals("even") && i % 2 == 0) {
                System.out.println(i);
            } else if (choice.equals("odd") && i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
