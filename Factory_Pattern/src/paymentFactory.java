
public class paymentFactory {
    public payment createPayment(String paymentType){
        if (paymentType.equalsIgnoreCase("CreditCard")){
            return new creditCartPayment();
        }
        else if (paymentType.equalsIgnoreCase("BankTransfer")){
            return new bankTransferPayment();
        }
        else if (paymentType.equalsIgnoreCase("PayPal")){
            return new payPalPayment();
        }
        else if (paymentType.equalsIgnoreCase("Dijital")){
            return new dijitalPayment();
        }
        return null;
        
        
    }
}
