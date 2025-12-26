/*
4. Write a program where the user enters an initial number, then will enter other N numbers. The program execution will continue until the entered number divided by the first number has a remainder different from 0. Numbers smaller than the first number should be ignored.
 */
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        int initialNumber = sc.nextInt();

        if (initialNumber == 0) {
            System.out.println("The initial number cannot be zero. Exiting.");
            sc.close();
            return;
        }

        while (true) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number < initialNumber) {
                System.out.println("Ignoring number " + number + " as it's smaller than " + initialNumber + ".");
                continue;
            }
            
            if (number % initialNumber != 0) {
                System.out.println("Exiting loop because " + number + " is not a multiple of " + initialNumber + ".");
                break;
            }
        }

        sc.close();
    }
}
