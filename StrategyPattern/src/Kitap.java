
public class Kitap {
    
    private String adi;
    private String yazar;
    private int sayfaSayisi;
    

    public Kitap(String adi, String yazar, int sayfaSayisi) {
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    @Override
    public String toString() {
        return "\nKitap{\n" + "adi=" + adi + 
                "\n yazar=" + yazar + 
                "\n sayfaSayisi=" + sayfaSayisi + '}';
    }
    
    
    
}
