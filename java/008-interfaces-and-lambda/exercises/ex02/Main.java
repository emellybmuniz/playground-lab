/* USING FUNCTIONAL INTERFACES AND LAMBDA EXPRESSIONS
2 - Write a code that calculates the tax value of products. The available products must be of the following types: Food, Health and Wellness, Clothing, and Culture. All products must have a method to return their tax value according to their type:

Food 1%;
Health and Wellness 1.5%;
Clothing 2.5%;
Culture 4%.
*/

package exercises.ex02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            startProductTaxCalculation(scanner);
        }
    }

    private static void startProductTaxCalculation(Scanner scanner) {
        System.out.println("Digite o tipo de produto (1 - Alimentício, 2 - Saúde e Bem-estar, 3 - Vestuário, 4 - Cultura):");
        int productType = scanner.nextInt();
        System.out.println("Digite o valor do produto:");
        double productValue = scanner.nextDouble();

        TaxValueService taxCalculation;
        switch (productType) {
            case 1:
                taxCalculation = value -> value * 0.01;
                break;
            case 2:
                taxCalculation = value -> value * 0.015;
                break;
            case 3:
                taxCalculation = value -> value * 0.025;
                break;
            case 4:
                taxCalculation = value -> value * 0.04;
                break;
            default:
                System.out.println("Tipo de produto inválido.");
                return;
        }
        
        Product product = new Product(productValue, taxCalculation);
        double taxValue = product.calculateTax();
        System.out.printf("O valor do imposto para o produto é: R$ %.2f%n", taxValue);
    }
}
