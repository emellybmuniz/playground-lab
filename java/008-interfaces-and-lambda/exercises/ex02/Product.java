package exercises.ex02;

public class Product {
    private final double value;
    private final TaxValueService taxSevice;

    public Product(double value, TaxValueService taxSevice) {
        this.value = value;
        this.taxSevice = taxSevice;
    }

    public double calculateTax() {
        return taxSevice.calculateTax(value);
    }
}
