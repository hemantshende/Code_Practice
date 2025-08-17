package Design_patterns.Structural_design_pattern.Decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Simple Coffee ";
    }

    @Override
    public Double getCost() {
        return 50.0;
    }
}
