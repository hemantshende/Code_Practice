package Design_patterns.Behavioural_Design_pattern.Strategy.PayemtMode;

public class CashPayment implements paymentMode{
    @Override
    public void makePayment() {
        System.out.println("Cash payment");
    }
}
