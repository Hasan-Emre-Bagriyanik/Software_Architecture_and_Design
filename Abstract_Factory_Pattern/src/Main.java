
public class Main {
    public static void main(String[] args) {
        paymentFactor creditCardFactory = new creditCardPaymentFactory();
        Payment creditCardPayment = creditCardFactory.createPayment();
        creditCardPayment.processPayment();
        
        paymentFactor payPalFactory = new payPalPaymentFactory();
        Payment paypalPayment = payPalFactory.createPayment();
        paypalPayment.processPayment();
        
        
    }
}
