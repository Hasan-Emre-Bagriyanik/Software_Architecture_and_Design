
public class VIPTicketBuilder implements TicketBuilder{

    private Ticket ticket;
    
    @Override
    public void buildPassangerName() {
        ticket.setPassangerName("Veysel Ugurlu");
    }

    @Override
    public void buildDepartueLocation() {
       ticket.setDepartureLocation("Hatay hava limanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("Hatay-istanbul ");
    }

    @Override
    public void buildDate() {
        ticket.setDate("03-03-2024");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("12");
    }

    @Override
    public Ticket getTicket() {
        return  ticket;
    }
    
    public VIPTicketBuilder(){
        this.ticket = new Ticket();
    }
    
}
