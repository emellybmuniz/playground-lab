import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            BigDecimal num1 = new BigDecimal(scanner.nextLine());

                        BigDecimal num2 = new BigDecimal(scanner.nextLine());

                        System.out.println("Select operation:");
                        for (OperationEnum op : OperationEnum.values()) {
                            System.out.println(op.ordinal() + 1 + ". " + op.getSymbol());
                        }

                        int choice = Integer.parseInt(scanner.nextLine());

                        if (choice < 1 || choice > Arrays.stream(OperationEnum.values()).count()) {
                            System.out.println("Invalid choice.");
                            return;
                        }

            OperationEnum selectedOperation = OperationEnum.values()[choice - 1];
            BigDecimal result;
            try {
                result = selectedOperation.getOperation().apply(num1, num2);
                System.out.printf("Result of %s %s %s = %s%n", num1, selectedOperation.getSymbol(), num2, result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid number.");
        } finally {
            scanner.close();
        }

    }
}
