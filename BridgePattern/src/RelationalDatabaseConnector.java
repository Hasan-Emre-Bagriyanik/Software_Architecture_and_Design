
public class RelationalDatabaseConnector implements DatabaseConnector{
    private DatabasePaltform platform;
    
    public RelationalDatabaseConnector(DatabasePaltform platform){
        this.platform = platform;
    }
    
    public void connect(){
        System.out.println("İliskisel veritabani baglandi");
        platform.configureConnection();
    }
    
    public void executeQuery(String query){
        System.out.println("Sorgu calistirildi. " + query);
    }
}
