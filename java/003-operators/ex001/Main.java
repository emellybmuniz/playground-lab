import java.util.Scanner;
import java.time.Year;

/* Exercises

1. Write a code that receives a person's name and year of birth and prints on the screen the message: "Hello 'Fulano', you are 'X' years old."

2. Write a code that receives the side length of a square, calculates its area, and displays it on the screen
   - formula: area = side x side

3. Write a code that receives the base and height of a rectangle, calculates its area, and displays it on the screen
   - formula: area = base x height

4. Write a code that receives the name and age of 2 people and prints the age difference between them. */


public class Main { // The main method is the application's entry point
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);
        // tellAge(scanner);
        // areaOfSquare(scanner);
        // areaOfRectangle(scanner);
        ageDifferenceCalculator(scanner);
        scanner.close(); // it's inportant to close the scanner
    }

    // Exercise 1
    private static void tellAge(Scanner scanner) {
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt
        int currentYear = Year.now().getValue();
        int personAge = currentYear - yearOfBirth;
        System.out.println("Olá " + name + ", você tem " + personAge + " anos.");
    }

    // Exercise 2
    private static void areaOfSquare(Scanner scanner) {
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double sideSquareLength = scanner.nextDouble();
        double squareArea = sideSquareLength * sideSquareLength;
        System.out.println("Fórmula: " + Math.round(squareArea) + " cm² = " + Math.round(sideSquareLength) + " cm x " + Math.round(sideSquareLength) + " cm" );

        // formula: area = side x side
    }

    // Exercise 3
    private static void areaOfRectangle(Scanner scanner) {
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double height = scanner.nextDouble();
        double rectangleArea = base * height;

        System.out.println("Fórmula: " + Math.round(rectangleArea) + " cm² = " + Math.round(base) + " cm x " + Math.round(height) + " cm");

        // formula: area = base x height
    }

    // Exercise 4
    private static void ageDifferenceCalculator(Scanner scanner) {
        System.out.print("Digite o nome da 1ª pessoa: ");
        String person1Name = scanner.nextLine();
        System.out.print("Digite a idade da 1ª pessoa: ");
        int person1Age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt
        System.out.print("Digite o nome da 2ª pessoa: ");
        String person2Name = scanner.nextLine();
        System.out.print("Digite a idade da 2ª pessoa: ");
        int person2Age = scanner.nextInt();
        int ageDifference = Math.abs(person1Age - person2Age);
        System.out.println("A diferença de idade entre " + person1Name + " e " + person2Name + " é de " + ageDifference + " anos.");
        
    }
}
