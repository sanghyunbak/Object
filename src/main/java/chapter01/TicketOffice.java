package chapter01;

import java.util.ArrayList;
import java.util.Arrays;

public class TicketOffice {
    ArrayList<Ticket> tickets = new ArrayList<>();
    Long amount;

    /**
     *
     * @param amount
     * @param tickets : Arbitrary number of arguments (varargs), use three dots (ellipsis)
     */
    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    private Ticket getTicket() {
        return this.tickets.remove(0);
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void sellTicketTo(Audiance audiance) {
        plusAmount(audiance.buy(getTicket()));
    }
}
