package Design_patterns.Structural_design_pattern.Decorator;

public class chocolate extends Coffee_AddOn{
    chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + "+ Chocolate ";
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost() + 20.0;
    }
}
