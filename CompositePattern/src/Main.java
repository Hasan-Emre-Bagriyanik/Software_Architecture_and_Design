
public class Main {
    public static void main(String[] args) {
        
        Developer dev1 = new Developer("Hasan Emre Bagriyanik");
        Developer dev2 = new Developer("Mehmet Ali Sivri");
        Manager man = new Manager("Bora Aslan");

        Departman departman = new Departman("Kismi Calisan");
        departman.addEmployee(dev1);
        departman.addEmployee(dev2);
        departman.addEmployee(man);
        
        departman.showDetails();
        

        
    }
    
    
    
}
