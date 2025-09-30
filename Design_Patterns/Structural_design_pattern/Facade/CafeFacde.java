package Design_patterns.Structural_design_pattern.Facade;

public class CafeFacde {
    private cupProvider cupProvider;
    private Grinder grinder;
    private Brewer brewer;
    private MilkSteamer milkSteamer;

    CafeFacde(){
        this.brewer=new Brewer();
        this.grinder=new Grinder();
        this.milkSteamer=new MilkSteamer();
        this.cupProvider=new cupProvider();
    }

    public void orderCappuccino(String size){
        System.out.println("making your cappuccino..!!");
        cupProvider.cupSize(size);
        grinder.grind();
        milkSteamer.MilkStream();
        brewer.brew();
        System.out.println("Your Order is ready....Enjoy your cappuccino..!!");
    }
}
