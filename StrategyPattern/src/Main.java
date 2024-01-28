// 
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Kitap> Kitaplar = new ArrayList<>();
        Kitaplar.add(new Kitap("Design pattern", "Mehmet ali Sivri", 488));
        Kitaplar.add(new Kitap("Clean Coda", "Robert C. Martin", 464));
        Kitaplar.add(new Kitap("Python  ", "Hasan Emre Bağrıyanık", 500));

        Kutuphane kutuphane = new Kutuphane();
        
        KitapSiralamStrateji adinaGoreSiralama  =new AdinaGoreSiralamaStrateji();
        
        KitapSiralamStrateji yazarinaGoreSiralama  =new YazaraGoreSiralamaStrateji();

        KitapSiralamStrateji sayfaSayisinaGoreSiralama  =new SayfaSayisinaGoreSirlamaStrateji();

        
        kutuphane.setSiralamaStrateji(adinaGoreSiralama);
        kutuphane.KitaplarListele(Kitaplar);
        
        kutuphane.setSiralamaStrateji(yazarinaGoreSiralama);
        kutuphane.KitaplarListele(Kitaplar);
        
        kutuphane.setSiralamaStrateji(sayfaSayisinaGoreSiralama);
        kutuphane.KitaplarListele(Kitaplar);
        
    }
    
    
}
