
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean kontrol = true;
        
        while ( kontrol){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1- Temel fiyarları öğrenme\n"
                + "2- 8 GB RAM ekleme\n"
                + "3- 16 GB RAM ekleme\n"
                + "4- 32 GB RAM ekleme\n"
                + "5- 2 TB SSD disk ekleme ve 8 GB RAM ekleme\n"
                + "6- 512 GB SSD disk ekleme\n"
                + "7- 1 TB SSD disk ekleme\n"
                + "8- 2 TB SSD disk ekleme\n"
                + "0 a basarak cikis yapabilirsiniz.");
        System.out.print("Lutfen yapmak istediğiniz bir işlem seciniz: ");
        
        // Kullanıcının girdiği değeri alıyoruz
        int islem = scanner.nextInt();
        
        
            switch(islem){
                case 1: 
                    Bilgisayar temelBilgisayar = new TemelBilgisayar();
                    System.out.println("Fiyat: "+temelBilgisayar.fiyat()+ "TL" );
                    System.out.println("Açıklma: " + temelBilgisayar.aciklama());
                     break;
                
                case 2: 
                    //Ram eklenmiş
                    Bilgisayar ramBilgisayar = new RamEkleDecaoter(new TemelBilgisayar(),8);
                    System.out.println("Fiyat: "+ramBilgisayar.fiyat()+ " TL");
                    System.out.println("Açıklama: " + ramBilgisayar.aciklama());
                    break;
                     
                case 3: 
                    //Ram eklenmiş
                    Bilgisayar ramBilgisayar2 = new RamEkleDecaoter(new TemelBilgisayar(),16);
                    System.out.println("Fiyat: "+ramBilgisayar2.fiyat()+ " TL");
                    System.out.println("Açıklama: " + ramBilgisayar2.aciklama());
                    break;
                    
                case 4: 
                    //Ram eklenmiş
                    Bilgisayar ramBilgisayar3 = new RamEkleDecaoter(new TemelBilgisayar(),32);
                    System.out.println("Fiyat: "+ramBilgisayar3.fiyat()+ " TL");
                    System.out.println("Açıklama: " + ramBilgisayar3.aciklama());
                    break;
                    
                case 5: 
                    //depolama birimi ve ram eklenen
                    Bilgisayar depolomaRamliBilgisayar = new DepolamaBirimiEkleDecaroter(new RamEkleDecaoter(new TemelBilgisayar(),8),2);
                    System.out.println("Fiyat: "+depolomaRamliBilgisayar.fiyat());
                    System.out.println("Açıklama: "+depolomaRamliBilgisayar.aciklama());
                    break;
                    
                case 6:
                    //sadece depolama 512
                    Bilgisayar depolamaBilgisayar = new DepolamaBirimiEkleDecaroter(new TemelBilgisayar(),512);
                    System.out.println("Fiyat: "+depolamaBilgisayar.fiyat());
                    System.out.println("Açıklama: " +depolamaBilgisayar.aciklama());
                    break;
                    
                case 7:
                    //sadece depolama 1 
                    Bilgisayar depolamaBilgisayar2 = new DepolamaBirimiEkleDecaroter(new TemelBilgisayar(),1);
                    System.out.println("Fiyat: "+depolamaBilgisayar2.fiyat());
                    System.out.println("Açıklama: " +depolamaBilgisayar2.aciklama());
                    break;
                    
                case 8:
                    //sadece depolama 1 
                    Bilgisayar depolamaBilgisayar3 = new DepolamaBirimiEkleDecaroter(new TemelBilgisayar(),2);
                    System.out.println("Fiyat: "+depolamaBilgisayar3.fiyat());
                    System.out.println("Açıklama: " +depolamaBilgisayar3.aciklama());
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