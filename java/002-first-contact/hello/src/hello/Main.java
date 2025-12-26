package hello;

import java.util.Scanner;

public class Main {
    
    private final static String WELCOME_MESSAGE  = "Bem vindo(a)"; // Variable declaration and initialization
    
    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE); // Displaying the variable's value in the terminal
        // Creating a Scanner object
        var scanner = new Scanner(System.in); // = Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        // Reading user input
        String name = scanner.nextLine(); // = var name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt(); // = var age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Closing the Scanner object
        scanner.close(); // Displaying the variable's value in the terminal 
            System.out.println("Nice to meet you, " + name + "!"); // Concatenating strings
            System.out.printf("You are %s years old. \n", age); // Using printf to format the output     
    }
}

/*
 * Println vs print 
 * println() prints the string and moves to the next line, while print() prints the string without moving to the next line. (\n)
 * 
 * Printf vs println
 * printf() allows for formatted output, similar to printf in C, while println() simply prints the string as is.
 * 
 *  Java have a bold type system, which means that variables must be declared with a specific type (e.g., int, String) before they can be used.
 * 
 * keywords: are reserved words in Java that have a predefined meaning and cannot be used as identifiers (e.g., class, public, static).
 * 
 * Upper case and lower case letters are significant in Java, meaning that variable names and class names are case-sensitive (e.g., myVariable and MyVariable are different).
 * 
 * Main.java
 * In Java, the file name must match the public class name. If the public class is named Main, the file must be named Main.java.
 * 
 * Main.java vs Main.class
 * Main.java is the source code file written in Java, while Main.class is the compiled bytecode file that the Java Virtual Machine (JVM) can execute.
 */


