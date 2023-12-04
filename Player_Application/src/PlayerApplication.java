
public class PlayerApplication {
    public static void main(String[] args){
     
     
        FootballCoach footballCoach = new FootballCoach("Mehmet Ali", 21, "Türkiye", "Galatasaray");
        Footballer footballer = new Footballer("Hasan Emre Bağrıyanık", 20, "Türkiye", "Galatasaray", "Offensive Midfielder");
        
        System.out.println("Football Informations");
        System.out.println("***********************************");

        footballer.playerInformation();
        System.out.println("***********************************");

        footballer.setPosition("Defense");
        System.out.println("***********************************");

        footballer.playerInformation();
        System.out.println("***********************************");
        System.out.println("***********************************");
        

        footballCoach.playerInformation();
        System.out.println("***********************************");
        

        System.out.println();
        
    }
}
