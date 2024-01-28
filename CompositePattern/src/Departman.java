
import java.util.ArrayList;
import java.util.List;


public class Departman implements Employee{

    private String name;
    private List<Employee> employees = new ArrayList();
    
    public Departman(String name){
        this.name = name;
    }
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    
    @Override
    public void showDetails() {
        System.out.println("Departman: " +  name);
        System.out.println(name + " da calisanlari listesi: ");
        for(Employee employee: employees){
            employee.showDetails();
        }
    }
    
}
