package chapter01;

public class Audiance {
    private Bag bag;

    public Audiance(Bag bag) {
        this.bag = bag;
    }
// encapsulation
//    public Bag getBag() {
//        return bag;
//    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
