
import java.util.List;


public class Kutuphane {
   
    private KitapSiralamStrateji siralamaStrateji;
    
    
    public Kutuphane(){
        
    }

    public void setSiralamaStrateji(KitapSiralamStrateji siralamaStrateji) {
        this.siralamaStrateji = siralamaStrateji;
    }
    
    public void KitaplarListele(List<Kitap> Kitaplar){
        siralamaStrateji.sort(Kitaplar);
        for (Kitap kitap : Kitaplar){
            System.out.println(kitap);
        }
        
    }
    
}
