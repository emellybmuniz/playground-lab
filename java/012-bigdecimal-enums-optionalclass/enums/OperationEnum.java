import java.math.BigDecimal;
import java.util.function.BiFunction;

public enum OperationEnum {
    ADDITION(BigDecimal::add, "+"),
    SUBTRACTION(BigDecimal::subtract, "-"),
    MULTIPLICATION(BigDecimal::multiply, "*"),
    DIVISION((a, b) -> {
        if (b.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a.divide(b, 2, java.math.RoundingMode.HALF_UP);
    }, "/");

    private final BiFunction<BigDecimal, BigDecimal, BigDecimal> operation;
    private final String symbol;

    OperationEnum(BiFunction<BigDecimal, BigDecimal, BigDecimal> operation, String symbol) {
        this.operation = operation;
        this.symbol = symbol;
    }

    public BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation() {
        return operation;
    }

    public String getSymbol() {
        return symbol;
    }




}