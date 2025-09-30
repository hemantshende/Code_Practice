package Design_patterns.Behavioural_Design_pattern.Strategy.PayemtMode;

public class DebitCardPayment implements paymentMode{
    @Override
    public void makePayment() {
        System.out.println("Debit card payment");
    }
}
