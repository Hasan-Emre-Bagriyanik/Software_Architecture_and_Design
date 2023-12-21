public class RamEkleDecaoter extends BilgisayarDecorator{

    int ramBoyutu;

    public RamEkleDecaoter(Bilgisayar bilgisayar, int ramBoyutu) {
        super(bilgisayar);
        this.ramBoyutu = ramBoyutu;
    }

    @Override
    public double fiyat() {

        if(ramBoyutu  == 8){
            return super.fiyat() + 2500;
        }
        else if(ramBoyutu == 16){
            return super.fiyat() + 3499;
        }
        else if(ramBoyutu == 32){
            return super.fiyat() + 5999;
        }
        else{
            return super.fiyat();
        }
        
    }

    @Override
    public String aciklama() {
        
        if(ramBoyutu  == 8){
            return super.aciklama()+" 8 Gb Ram eklendi";        
        }
        else if(ramBoyutu == 16){
            return super.aciklama()+" 16 Gb Ram eklendi"; 
        }
        else if(ramBoyutu == 32){
            return super.aciklama()+" 32 Gb Ram eklendi"; 
        }
        else{
            return super.aciklama(); 
        }
    }
  

}
