 

public class FootballCoach extends Player{
    
    private String managedTeam;
    

    public FootballCoach(String name, int age, String nationalTeam,String managedTeam ) {
        super(name, age, nationalTeam);
        this.managedTeam = managedTeam;
        
    }

    public String getManagedTeam() {
        return managedTeam;
    }

    public void setManagedTeam(String managedTeam) {
        this.managedTeam = managedTeam;
    }
    

    @Override
    public void playerInformation() {
        System.out.println("......Footbal Player Information.....");
        System.out.println("Player is name: "+this.getName());
        System.out.println("Player is age: "+this.getAge());
        System.out.println("Player is National Team: "+this.getNationalTeam());
        System.out.println("Player is managed Team " + this.getManagedTeam());
               
    }
    
}
