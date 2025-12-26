import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
    var i = 0;
    Scanner scanner = new Scanner(System.in);
    // whileStructure(scanner);
    // whileTrue(scanner);
    // doWhile(scanner);

    // Iterates through and prints any command-line arguments passed to the program.
    while (args.length > i) {
        System.out.println(args[i]);
        i++;
    }

    scanner.close();
}

    private static void whileStructure(Scanner scanner) {
        var name = "";
        while (!name.equals("exit")) {
            System.out.print("Informe um nome: ");
            name = scanner.next();

            System.out.println(name);
        }
    }

    private static void whileTrue(Scanner scanner) {
        while (true) { // Creates an infinite loop that relies on an internal 'break' to exit.
            System.out.print("Informe um nome: ");
            var name = scanner.next();

            if (name.equals("exit")) {
                break;
            }

            System.out.println(name);
        }
    }

    private static void doWhile(Scanner scanner) {
        do {
            System.out.print("Informe um nome: ");
            var name = scanner.next();

            if (name.equals("exit")) {
                break;
            }

            System.out.println(name);
        } while (true);
    }
}