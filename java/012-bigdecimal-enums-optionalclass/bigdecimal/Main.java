public class Main {
    public static void main(String[] args) {
        var value1 = 0.1;
        var value2 = 0.2;
        var sum = value1 + value2;
        System.out.println("Sum: " + sum);
        // Fix the precision issue
        System.out.printf("Formatted Sum: %.1f%n", sum);
        // Alternatively, use BigDecimal for precise decimal arithmetic
        var bigDecimalSum = new java.math.BigDecimal("0.1").add(new java.math.BigDecimal("0.2"));
        System.out.println("------------------");
        System.out.println("BigDecimal Sum: " + bigDecimalSum);
    }
}