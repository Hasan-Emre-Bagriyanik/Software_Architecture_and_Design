
public class NoSqlDatabaseConnector  implements DatabaseConnector{
    
    private DatabasePaltform platform;
    
    public NoSqlDatabaseConnector(DatabasePaltform platform){
        this.platform = platform;
    }
    
    public void connect(){
        System.out.println("NOSQL veri tabanina baglaniliyor");
        platform.configureConnection();
    }
    public void executeQuery(String query){
        System.out.println("Sorgu calistirildi. " + query);
    }
    
}
