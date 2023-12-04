// builder 
public class Main {
    public static void main(String[] args) {
        TicketAgent agent = new TicketAgent();
        
        TicketBuilder economyTciketBuilder  =new EconomyTicketBuilder();
        TicketBuilder businessTicketBuilder = new BusinessTicketBuilder();
        TicketBuilder vipTicketBuilder  = new VIPTicketBuilder();
        
        
        agent.setTicketBuilder(economyTciketBuilder);
        agent.buildTicket();
        Ticket economyTicket = agent.getTicket();
        System.out.println("\nEconomy Ticket: "+ economyTicket);
        
        agent.setTicketBuilder(businessTicketBuilder);
        agent.buildTicket();
        Ticket businessTicket = agent.getTicket();
        System.out.println("\nBusiness Ticket: "+ businessTicket);
        
        agent.setTicketBuilder(vipTicketBuilder);   
        agent.buildTicket();
        Ticket vipTicket  =agent.getTicket();
        System.out.println("\nVIP Ticket: "+ vipTicket);



    }
}
