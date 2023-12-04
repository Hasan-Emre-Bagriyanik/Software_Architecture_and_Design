
public class Footballer extends Player implements IPosition{
    
    private String currentTeam;
    private String newPosition;
    


    public Footballer(String name, int age, String nationalTeam, String currentTeam, String newPosition) {
        super(name, age, nationalTeam);
        this.currentTeam = currentTeam;
        this.newPosition = newPosition;
  
        
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public String getNewPosition() {
        return newPosition;
    }

    public void setNewPosition(String newPosition) {
        this.newPosition = newPosition;
    }

   

    
    @Override
    public void playerInformation() {
        System.out.println("......Footbal Player Information.....");
        System.out.println("Player is name: "+this.getName());
        System.out.println("Player is age: "+this.getAge());
        System.out.println("Player is National Team: "+this.getNationalTeam());
        System.out.println("Player is Current Team: " + this.getCurrentTeam());
        System.out.println("Player is New Position: " + this.getNewPosition());


    }

    @Override
    public void setPosition(String position) {
        this.newPosition = position;
        
        System.out.println("Player is new position: " + this.getNewPosition());
    }

  

    
   
    
}
