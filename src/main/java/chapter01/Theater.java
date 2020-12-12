package chapter01;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audiance audiance) {
        ticketSeller.sellTo(audiance);
//        if (audiance.getBag().hasInvitation()) {
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audiance.getBag().setTicket(ticket);
//        } else {
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audiance.getBag().minusAmount(ticket.getFee());
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//            audiance.getBag().setTicket(ticket);
//        }
    }
}
