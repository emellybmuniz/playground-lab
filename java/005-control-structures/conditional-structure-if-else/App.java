import java.util.Scanner;

// Conditional Structures on Java
// if else and else if
public class App {
    public static void main(String[] args) throws Exception {
        var Scanner = new Scanner(System.in);
        // ifelseStatement(Scanner);
        // elseIfStatement(Scanner);
        // stringComparison(Scanner);
        ternaryStructure(Scanner);
        Scanner.close();
    }

    private static void ifelseStatement(Scanner scanner) {
        System.out.printf("Digite seu nome:\n");
        String name = scanner.nextLine();
        
        System.out.printf("Digite sua idade:\n");
        int age = scanner.nextInt();
        
        // Numbers on java can't be null, so 0 is used as a default value
        // if the age is 0, it means that the user didn't input a valid age
        
        // Type of structure #1
        if (age >= 18) System.out.println("Você é maior de idade.");
        else System.out.println("Você é menor de idade.");

        // Type of structure #2        
        if(name.isEmpty() || age <= 0) {
            System.out.println("Nome ou idade inválidos.");
        } else {
            System.out.println("Olá " + name + ", você tem " + age + " anos.");
        }
    }

    private static void elseIfStatement(Scanner scanner) {
        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        // Type of structure #3
        if (age < 0) {
            System.out.print("Idade inválida.");
        } else if (age < 12) {
            System.out.print("Você é uma criança.");
        } else if (age < 18) {
            System.out.print("Você é um adolescente.");
        } else if (age < 60) {
            System.out.print("Você é um adulto.");
        } else {
            System.out.print("Você é um idoso.");
        }
    }

    // equals & equalsIgnoreCase
    private static void stringComparison(Scanner scanner) {
        System.out.print("Digite sua idade: ");
        String ageInput = scanner.nextLine(); 
        int age = -1;

        try {
            age = Integer.parseInt(ageInput); // Converting the input to an integer
        } catch (NumberFormatException e) {
            System.out.print("Entrada inválida. Por favor, insira um número inteiro para a idade.");
            return;
        }

        // Type of structure #4
        if (age < 0) {
            System.out.print("Idade inválida.");
        } else if (age < 16) {
            System.out.print("Você é uma criança.");
        } else if (age < 18) {
            System.out.print("Você é emancipado? (sim/não): ");
            String isEmancipated = scanner.nextLine();

            if (isEmancipated.equalsIgnoreCase("sim")) {
                System.out.print("Você é um adolescente emancipado.");
            } else {
                System.out.print("Você é um adolescente, mas não emancipado.");
            }
        } else if (age < 60) {
            System.out.print("Você é um adulto.");
        } else {
            System.out.print("Você é um idoso.");
        }
    }  

    // Ternary operator or Elvis operator
    private static void ternaryStructure(Scanner scanner) {
        System.out.print("Digite sua idade: ");
        String ageInput = scanner.nextLine();
        System.out.print("É emancipado? (sim/não): ");
        String isEmancipated = scanner.nextLine();
        int age = -1;
        try {
            age = Integer.parseInt(ageInput); 
        } catch (NumberFormatException e) {
            System.out.print("Entrada inválida. Por favor, insira um número inteiro para a idade.");
            return;
        }

        // Type of structure #5
        var canDrive = (age >= 18) || (age >= 16 && isEmancipated.equalsIgnoreCase("sim"));
        var message = canDrive ? "Você pode dirigir.\n" : "Você não pode dirigir.\n";
    
        System.out.print(message);
    }

}
