
public class BusinessTicketBuilder  implements TicketBuilder{

    private Ticket ticket;
    @Override
    public void buildPassangerName() {
        ticket.setPassangerName("Hasan Emre Bağrıyanık");
    }

    @Override
    public void buildDepartueLocation() {
        ticket.setDepartureLocation("İstanbul Sabiha gökçen hava limanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("ordu-giresun havalimanı");
    }

    @Override
    public void buildDate() {
        ticket.setDate("15-01-2024");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("7");
    }

    /**
     *
     * @return
     */
    @Override
    public Ticket getTicket() {
        return ticket;
    }
  
    
    public BusinessTicketBuilder(){
        this.ticket = new Ticket();
    }
}
