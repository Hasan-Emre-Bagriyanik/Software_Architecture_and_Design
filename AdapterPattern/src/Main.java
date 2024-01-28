
public class Main {
    public static void main(String[] args) {
        
        // mevcut sistemdeki görev
        Gorev basitGorev = new BasitGorev("Temel Gorevler");
        
        // farklı bir görev tipi 
        GelistirilmisGorev gelistirilmisGorev = new GelistirilmisGorev("Gelistirilmis Gorevler");
        
        // adaptasyon sistemleri
        Gorev adapter = new GelistirilmisGorevAdapter(gelistirilmisGorev);
        
        System.out.println("Basit gorevler: " + basitGorev.getGorevAdi());
        System.out.println("Gelistirilmis gorevler: " + adapter.getGorevAdi());

    }
}
