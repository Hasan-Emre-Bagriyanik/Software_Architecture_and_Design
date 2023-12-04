// builder (oluşturucu) ticket arayüzü
public interface TicketBuilder {
    void buildPassangerName();
    void buildDepartueLocation();
    void buildDestination();
    void buildDate();
    void buildSeatNumber();
    Ticket getTicket();
}
