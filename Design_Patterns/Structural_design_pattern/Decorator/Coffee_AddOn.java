package Design_patterns.Structural_design_pattern.Decorator;


public abstract class Coffee_AddOn implements Coffee {
    protected Coffee decoratedCoffee;

    Coffee_AddOn(Coffee coffee){
        this.decoratedCoffee=coffee;
    }
                                                //this class is decorator...
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost();
    }
}
