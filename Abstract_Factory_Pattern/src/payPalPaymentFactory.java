
public class payPalPaymentFactory implements paymentFactor{

    @Override
    public Payment createPayment() {
        return new payPalPayment();
    }
    
}
