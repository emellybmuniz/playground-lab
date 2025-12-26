import java.util.Scanner;

// Seeing operators in action
public class App {
    public static void main(String[] args) {
        // It's best practice to create a single Scanner for System.in
        // and pass it to the methods that need it.
        // The try-with-resources block ensures it's closed at the end.
        // scanner is used for reading input from the console.
        try (var scanner = new Scanner(System.in)) {
            testAddition(scanner); // name + method to test addition
            testEvenOrOddV1(scanner);
            testEvenOrOddV2(scanner);
            testCanDrive(scanner);
        }
    }

    private static void testAddition(Scanner scanner) {
        // isRigh, isEven and others in private static are local variables
        System.out.print("Quanto é 2 + 2? ");
        var result = scanner.nextInt(); // nexInt - reads an integer from the input
        System.out.println("Você respondeu: " + result);
        System.out.println("Olá, mundo");

        var isRight = result == 4;
        System.out.println("Falso ou verdadeiro? " + isRight); // boolean expression
        System.out.println("Você acertou? " + (isRight ? "Sim!" : "Não!")); 
        System.out.println("---");
    } // condition ? valueIfTrue : valueIfFalse -> ternary operator

    private static void testEvenOrOddV1(Scanner scanner) {
        System.out.print("Digite um número: ");
        var number = scanner.nextInt();
        var isEven = number % 2 == 0; // Modulus operator to check evenness
        System.out.println("O número " + number + " é " + (isEven ? "par" : "ímpar"));
        System.out.println("---"); // Separator for clarity
    }

    private static void testEvenOrOddV2(Scanner scanner) {
        System.out.print("Digite outro número: ");
        var checkNumber = scanner.nextInt();
        var isOdd = checkNumber % 2 != 0;
        System.out.printf("O número %d é %símpar.%n", checkNumber, isOdd ? "" : "não ");
        // args can be used in printf for formatted output
        // %n is a line separator in printf
    }


    private static void testCanDrive(Scanner scanner) {
        /*
         * Logical Operators Tables
         * -------------------------------------------------
         * AND (&&) - Return true if BOTH sides are true.
         * +-------+-------+---------+
         * |   A   |   B   | A && B  |
         * +-------+-------+---------+
         * | true  | true  | true    |
         * | true  | false | false   |
         * | false | true  | false   |
         * | false | false | false   |
         * +-------+-------+---------+
         *
         * OR (||) - return true if AT LEAST ONE side is true.
         * +-------+-------+---------+
         * |   A   |   B   | A || B  |
         * +-------+-------+---------+
         * | true  | true  | true    |
         * | true  | false | true    |
         * | false | true  | true    |
         * | false | false | false   |
         * +-------+-------+---------+
         *
         * NOT (!) - Inverts the boolean value.
         * +-------+-------+
         * |   A   |  !A   |
         * +-------+-------+
         * | true  | false |
         * | false | true  |
         * +-------+-------+
         *
         * Comparison Operators
         * -------------------------------------------------
         * Used for comparing values. The result is always a boolean.
         *
         * ==  Equal to
         * !=  Diferent from
         * >   Huge than
         * <   Less than
         * >=  Huge or equal to
         * <=  less than or equal to
         */
        System.out.print("Digite sua idade: ");
        var age = scanner.nextInt();

        if (age < 0 || age >= 150) {
            System.out.println("Idade inválida. Por favor, insira um valor entre 0 e 149.");
            return;
        }

        boolean isEmancipated = false;
        if (age < 18) {
            System.out.print("Você é emancipado? (Sim ou Não): ");
            var response = scanner.next();
            isEmancipated = response.equalsIgnoreCase("Sim") || response.equalsIgnoreCase("S");
        }
        boolean canDrive = age >= 18 || isEmancipated;

        System.out.printf("Você %s dirigir.%n", canDrive ? "pode" : "não pode");
    }
} // %[arg$][flags][width][.precision]conversion.

// || vs |
// || is a short-circuit operator, it evaluates the second operand only if the first is false.
// | is a bitwise operator, it evaluates both operands regardless of the first's value.

