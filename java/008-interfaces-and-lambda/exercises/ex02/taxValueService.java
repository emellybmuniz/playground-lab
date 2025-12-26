package exercises.ex02;

@FunctionalInterface
interface TaxValueService {
    double calculateTax(double value);
}