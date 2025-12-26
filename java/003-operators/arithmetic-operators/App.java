import java.util.Scanner;

// Arithmetic Operators - making a simple calculator
public class App {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            // methods to run

            //calculateSquareRoot(scanner);
            // Caculator(scanner);
            // calculatePower(scanner);
            increaseValue(scanner);
        };
    }

private static void Caculator(Scanner scanner) {
    System.out.print("Entre com o primeiro número: ");
    var num1 = scanner.nextDouble(); // float, double, etc.
    System.out.print("Entre com o segundo número: ");
    var num2 = scanner.nextDouble();

    System.out.println("Escolha uma operação: +, -, *, /");
    var operator = scanner.next();

    double result;
    switch (operator) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            if (num2 == 0) {
                System.out.println("Erro: Divisão por zero não é permitida.");
                return;
            }
            result = num1 / num2;
            break;
        default: // Invalid operator
            System.out.println("Operador inválido.");
            return;
    }
    System.out.println(num1 + " " + operator + " " + num2);
    System.out.println("Resultado:" + result);

    var value = 2 + 3 * 4;
    System.out.println(value);
}

// Getting out of the Scope operators 
// Learning a little about Math.sqrt 
public static void calculateSquareRoot(Scanner scanner) {
    System.out.print("Entre com um número para calcular a raiz quadrada: ");
    double value = scanner.nextDouble();

    if (value < 0) {
        System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
    } else {
        double squareRoot = Math.sqrt(value);
        System.out.println("A raiz quadrada de " + value + " é: " + squareRoot); 
    } // math works with double
}

private static void calculatePower(Scanner scanner) {
    System.out.print("Entre com a base: ");
    double base = scanner.nextDouble();
    System.out.print("Entre com o expoente: ");
    double exponent = scanner.nextDouble();
    
    double result = Math.pow(base, exponent);
    System.out.println(base + " elevado a " + exponent + " é igual a: "  + result);
}

private static void increaseValue(Scanner scanner) {
    System.out.print("Entre com um número: ");
    double value = scanner.nextDouble();
    System.out.println(++value);

    // (value++); // This will not work, because the value is not being printed after the increment
    // Java prints the value before the increment when using value++.
}
} 
// % operator - rest of the division
// Double vs Float
//    Double is more precise than Float, but consumes more memory.
//    Float is used when precision is not so critical and memory saving is important.

// The calculus in JAVA is made at left to right, so if you want to make a calculus like 2 + 3 * 4, the result will be 14, because the multiplication is made first. (javascript screams internally)
