package Design_patterns.Structural_design_pattern.Decorator;

public class Milk extends Coffee_AddOn{
    Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + "+ Milk ";
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost() + 10.0;
    }
}
