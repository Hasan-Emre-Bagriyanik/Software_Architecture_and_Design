
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    
        paymentFactory paymentFactory = new paymentFactory();
        
       boolean kontrol = true;
        
        while ( kontrol){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1- Credit Card Payment\n"
                + "2- Bank Transfer Payment\n"
                + "3- Paypal Payment\n"
                + "4- Dijital Payment\n"
                + "0 a basarak cikis yapabilirsiniz.");
        System.out.print("Lutfen bir odeme sekli seciniz: ");
        
        // Kullanıcının girdiği değeri alıyoruz
        int odeme = scanner.nextInt();
        
        
            switch(odeme){
                case 1: 
                     payment creditCartPayment = paymentFactory.createPayment("CreditCard");
                     creditCartPayment.processPayment();
                     break;
                
                case 2: 
                    payment bankTransferPayment = paymentFactory.createPayment("BankTransfer");
                    bankTransferPayment.processPayment();
                    break;
                     
                case 3: 
                    payment payPalPayment = paymentFactory.createPayment("PayPal");
                    payPalPayment.processPayment();
                    break;
                     
                case 4: 
                    payment dijitalPayment = paymentFactory.createPayment("Dijital");
                    dijitalPayment.processPayment();
                    break;
                    
                case 0:
                    kontrol = false;
                    break;
                
                default:
                    break;
            }
        }
            
}
}
