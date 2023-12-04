
public class TicketAgent {
 private TicketBuilder ticketBuilder; 
 
 public void setTicketBuilder(TicketBuilder ticketBuilder){
     this.ticketBuilder =  ticketBuilder;
     
 }
 

public Ticket getTicket() {
    
    return ticketBuilder.getTicket();
}
 
 public void buildTicket(){
 
     ticketBuilder.buildPassangerName();
     ticketBuilder.buildDepartueLocation();
     ticketBuilder.buildDestination();
     ticketBuilder.buildDate();
     ticketBuilder.buildSeatNumber();
 }
 
}
