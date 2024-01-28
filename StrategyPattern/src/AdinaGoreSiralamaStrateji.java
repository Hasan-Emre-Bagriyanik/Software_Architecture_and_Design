
import java.util.List;


public class AdinaGoreSiralamaStrateji implements KitapSiralamStrateji{

    @Override
    public void sort(List<Kitap> kitaplar) {
        // karşılaştırma işlemi yapıyor 
        kitaplar.sort((b1,b2) -> b1.getAdi().compareTo(b2.getAdi()));
        System.out.println("Kitaplar, adina gore alfabetik siralandi. ");
    }
    
}
