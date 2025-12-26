/*
 * 
 * 1. Write a program where the user enters a number and the multiplication table from 1 to 10 of that 
 * number is generated;
 * 
 */

public class ex01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        scanner.close();
    }

}
