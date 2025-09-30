package Design_patterns.Behavioural_Design_pattern.Strategy.PayemtMode;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext=new PaymentContext(new CashPayment());
        paymentContext.makePayment();

        PaymentContext paymentContext1=new PaymentContext(new CreditCardPayment());
        paymentContext1.makePayment();

        PaymentContext paymentContext2=new PaymentContext(new DebitCardPayment());
        paymentContext2.makePayment();

        PaymentContext paymentContext3=new PaymentContext(new UPIPayment());
        paymentContext3.makePayment();
    }
}
