package Design_patterns.Structural_design_pattern.Decorator;

public class User {
    public static void main(String[] args) {
        Coffee coffee=new SimpleCoffee();
        System.out.println(coffee.getDescription()+" "+coffee.getCost());

        coffee=new Milk(coffee);
        System.out.println(coffee.getDescription()+" "+coffee.getCost());

        coffee=new chocolate(coffee);
        System.out.println(coffee.getDescription()+" "+coffee.getCost());

        coffee=new Sugar(coffee);
        System.out.println(coffee.getDescription()+" "+coffee.getCost());
    }
}
