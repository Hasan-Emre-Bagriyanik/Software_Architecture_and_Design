
public class creditCardPaymentFactory implements paymentFactor{

    @Override
    public Payment createPayment() {
        return new creditCardPayment();
    }
    
}
