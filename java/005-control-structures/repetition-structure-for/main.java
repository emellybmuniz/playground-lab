import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // repetitions(scanner);
        // increase(scanner);
        // onlyOddNumbers(scanner);
        // onlyOddNumbersAlternative(scanner);  
        // decrease(scanner);
        // onlyEvenNumbers(scanner);

        for(var  arg : args) {
            System.out.println(arg);
            /* 
             * >> 
                hello
                world
                this is one argument
                123
             */
        }

        scanner.close();
        
    }

    private static void repetitions(Scanner scanner) {
       for (;;) {
            System.out.print("Insira uma string ou 'sair' para encerrar o programa): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) break;
            System.out.println(input);
        }
    }

    private static void increase(Scanner scanner) {
        for (var i = 1; i <= 100; i ++) {
            System.out.println(i);
        }
        System.out.println("Fim do programa :)");
    }

    private static void onlyOddNumbers(Scanner scanner) {
        for (var i = 0; i <= 200; i++) {
            if (i % 2 != 0) {
                continue; // // Skips the rest of the current iteration when i is Even
            }
            System.out.println(i);
            }
}
    private static void onlyOddNumbersAlternative(Scanner scanner) {
        for (var i = 0; i <= 100; i+=2) System.out.println(i);
    }

    private static void decrease(Scanner scanner) {
        for (var i = 100; i >= 0; i--) System.out.println(i);
    }

    private static void onlyEvenNumbers(Scanner scanner) {
        for (var i = 0; i <= 100; i ++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }

}
