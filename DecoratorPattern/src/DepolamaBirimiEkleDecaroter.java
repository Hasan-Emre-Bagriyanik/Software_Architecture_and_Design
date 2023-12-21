public class DepolamaBirimiEkleDecaroter extends BilgisayarDecorator{
    int SSDBoyutu;
    
    public DepolamaBirimiEkleDecaroter(Bilgisayar bilgisayar, int SSDBoyutu) {
        super(bilgisayar);
        this.SSDBoyutu = SSDBoyutu;
    }

    @Override
    public double fiyat() {
        
         if(SSDBoyutu  == 512){
            return super.fiyat() + 1599;
        }
        else if(SSDBoyutu == 1){
            return super.fiyat() + 2499;
        }
        else if(SSDBoyutu == 2){
            return super.fiyat() + 4999;
        }
        else{
            return super.fiyat();
        }
    }

    @Override
    public String aciklama() {
        
         if(SSDBoyutu  == 512){
            return super.aciklama()+" 512 GB SSD disk eklendi";        
        }
        else if(SSDBoyutu == 1){
            return super.aciklama()+" 1 TB SSD disk eklendi"; 
        }
        else if(SSDBoyutu == 2){
            return super.aciklama()+" 2 TB SSD disk eklendi"; 
        }
        else{
            return super.aciklama(); 
        }
    }

   
}
