/*
 * 3 - Write a code where it is possible to calculate the area of a geometric figure. All figures must have a method that returns this value. The available geometric shapes must be as follows:

Square: has the value of its sides;
Rectangle: has the values of base and height;
Circle: has the radius attribute.
 */

package exercises.ex03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            startAreaCalculation(scanner);
        }
    }

    private static void startAreaCalculation(Scanner scanner) {
        System.out.println("Digite o tipo de figura geométrica (1 - Quadrado, 2 - Retângulo, 3 - Círculo):");
        int shapeType = scanner.nextInt();

        AreaCalculationService areaCalculation;
        switch (shapeType) {
            case 1:
                System.out.println("Digite o valor do lado do quadrado:");
                double side = scanner.nextDouble();
                areaCalculation = () -> side * side;
                break;
            case 2:
                System.out.println("Digite o valor da base do retângulo:");
                double base = scanner.nextDouble();
                System.out.println("Digite o valor da altura do retângulo:");
                double height = scanner.nextDouble();
                areaCalculation = () -> base * height;
                break;
            case 3:
                System.out.println("Digite o valor do raio do círculo:");
                double radius = scanner.nextDouble();
                areaCalculation = () -> Math.PI * Math.pow(radius, 2);
                break;
            default:
                System.out.println("Tipo de figura inválido.");                
                return;
        }
        geometricFigure figure = new geometricFigure(areaCalculation);
        double area = figure.getArea();
        System.out.printf("A área da figura é: %.2f%n", area);
    }
}
