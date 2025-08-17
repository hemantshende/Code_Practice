package Design_patterns.Behavioural_Design_pattern.Strategy.PayemtMode;

public class UPIPayment implements paymentMode{
    @Override
    public void makePayment() {
        System.out.println("Upi payment");
    }
}
