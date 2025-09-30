package Design_patterns.Behavioural_Design_pattern.Strategy.PayemtMode;

public class CreditCardPayment implements paymentMode{
    @Override
    public void makePayment() {
        System.out.println("Credit card payment");
    }
}
