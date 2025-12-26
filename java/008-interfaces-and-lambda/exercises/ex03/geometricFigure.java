package exercises.ex03;

public class geometricFigure {
    private final AreaCalculationService areaCalculator;

    public geometricFigure(AreaCalculationService areaCalculator) {
        this.areaCalculator = areaCalculator;
    }
    public double getArea() {
        return areaCalculator.calculateArea();
    }
}
