import java.util.Scanner;

// Switch Case
public class main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // recive input from user
        // testingSwitch(scanner);
        // modernSwitch(scanner);
        // symplifySwitch(scanner);
        mixingTheConcepts(scanner);
        scanner.close();
    }

    private static void testingSwitch(Scanner scanner) {
        System.out.println("Informe um número de 1 a 7: ");
        var option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Você escolheu a opção 1."); 
                System.out.println("Segunda");
                break; // make sure to break to avoid fall-through
            case 2:
                System.out.println("Você escolheu a opção 2");  
                System.out.println("Terça");   
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Você escolheu a opção 4");
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Você escolheu a opção 5");
                System.out.println("Sexta");
                break;
            case 6:
            case 7: // fall-through case
                System.out.println("Você escolheu a opção 6 ou 7");
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Número fora do escopo!");
                break;
        }
    }

    private static void modernSwitch(Scanner scanner) {
        System.out.println("Informe um número de 1 a 7: ");
        var option = scanner.nextInt();
        switch (option) {
            case 1 -> System.out.println("Você escolheu a opção 1."); // modern switch syntax
            case 2 -> System.out.println("Você escolheu a opção 2"); // without break
            case 3 -> System.out.println("Você escolheu a opção 3"); // and one line per case
            case 4 -> {
                System.out.println("Você escolheu a opção 4"); // multiple statements in a case
                System.out.println("Foi uma boa escolha!");
                // whitout break here :)
            }
            case 5 -> System.out.println("Você escolheu a opção 5");
            case 6, 7 -> { // modern switch with multiple cases
                System.out.println("Você escolheu a opção 6 ou 7");
                System.out.println("Fim do Programa!");
            }
            default -> System.out.println("Número fora do escopo!");
        }
    }

    private static void symplifySwitch(Scanner scanner) {
        System.out.println("Informe um número de 1 a 7: ");
        var option = scanner.nextInt();
        String day = switch (option) {
            case 1 -> "Segunda";
            case 2 -> "Terça";
            case 3 -> "Quarta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6, 7 -> "Fim de semana :)";
            default -> "Número fora do escopo! :(";
        };
        System.out.println(day);
    }

    private static void mixingTheConcepts(Scanner scanner) {
        System.out.println("Informe um número de 1 a 7: ");
        var option = scanner.nextInt();
        String day = switch (option) {
            case 1 -> "Segunda";
            case 2 -> "Terça";
            case 3 -> "Quarta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6, 7 -> {
                var weekendy = option == 6 ? "Sábado" : "Domingo"; // ternary operator (again)
                yield "Hoje é %s !".formatted(weekendy); // yield to return a value from a block
            }
            default -> "Número fora do escopo! :(";
        };
        System.out.println(day);
    }
}








