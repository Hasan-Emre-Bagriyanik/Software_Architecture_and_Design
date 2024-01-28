
import java.util.List;


public class YazaraGoreSiralamaStrateji implements KitapSiralamStrateji {

    @Override
    public void sort(List<Kitap> kitaplar) {
        kitaplar.sort((b1,b2) -> b1.getYazar().compareTo(b2.getYazar()));
        System.out.println("Kitaplar, yazara gore alfabetik siralandi. ");
    }
    
}
