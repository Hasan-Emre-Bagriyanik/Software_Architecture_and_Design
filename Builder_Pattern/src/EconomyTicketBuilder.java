
public class EconomyTicketBuilder  implements TicketBuilder{

    private Ticket ticket;
     public void buildPassangerName() {
        ticket.setPassangerName("Mehmet Ali Sivri");
    }

    @Override
    public void buildDepartueLocation() {
        ticket.setDepartureLocation("İstanbul Sabiha gökçen hava limanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("hatay-bursa havalimanı");
    }

    @Override
    public void buildDate() {
        ticket.setDate("20-01-2024");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("5");
    }
    
      @Override
    public Ticket getTicket() {
        return ticket;
    }
  
    
    public EconomyTicketBuilder(){
        this.ticket = new Ticket();
    }
}
