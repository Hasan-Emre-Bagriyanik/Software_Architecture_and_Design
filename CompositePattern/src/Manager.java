
public class Manager implements Employee{
    private String name;
    
    public Manager(String name){
        this.name = name;
    }
    
    public void showDetails(){
        System.out.println("Manager: " + name);
    }
}
