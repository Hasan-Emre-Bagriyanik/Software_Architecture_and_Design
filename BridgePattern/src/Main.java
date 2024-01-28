
public class Main {
    public static void main(String[] args) {
        DatabaseConnector relationalDBConnector = new RelationalDatabaseConnector(new MySQLConnection());
        relationalDBConnector.connect();
        relationalDBConnector.executeQuery("select * from users");
        
        
        DatabaseConnector noSqlConnector = new NoSqlDatabaseConnector(new MongoDBConnection());
        noSqlConnector.connect();
        noSqlConnector.executeQuery("db.users.find()");
    }
}
