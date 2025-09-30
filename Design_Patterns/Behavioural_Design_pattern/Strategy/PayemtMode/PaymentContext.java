package Design_patterns.Behavioural_Design_pattern.Strategy.PayemtMode;

public class PaymentContext {
    private paymentMode paymentMode;

    PaymentContext(paymentMode paymentMode){
        this.paymentMode=paymentMode;
    }

    public void makePayment(){
        if(paymentMode==null){
            throw new RuntimeException("select payment method");
        }

        paymentMode.makePayment();
    }
}
