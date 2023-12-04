
public class payPalPayment implements payment{

    @Override
    public void processPayment(){
        System.out.println("Paypal ile odemeniz gerceklestirildi.");
    }
}
