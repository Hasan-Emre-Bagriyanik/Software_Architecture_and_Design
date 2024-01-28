
public class GelistirilmisGorevAdapter implements Gorev{
    
    private GelistirilmisGorev gelistirilmisGorev;
    
    public GelistirilmisGorevAdapter(GelistirilmisGorev gelistirilmisGorev){
        this.gelistirilmisGorev = gelistirilmisGorev;
    }
    
    public String getGorevAdi(){
        return gelistirilmisGorev.taskIsimGetir();
    }
}
