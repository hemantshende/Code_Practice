package Design_patterns.Structural_design_pattern.Decorator;

public class Sugar extends Coffee_AddOn{
    Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Sugar ";
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost() + 2.0;
    }
}
