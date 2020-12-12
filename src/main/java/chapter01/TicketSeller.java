package chapter01;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
//    encapsulation
//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audiance audiance) {
        ticketOffice.sellTicketTo(audiance);
    }
}
