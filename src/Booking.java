import java.util.Date;

public class Booking {

    private Ticket ticket;
    private Date dateTime;

    public Booking(Ticket t) {
        this.ticket = t;
        this.dateTime = new Date();
    }
}
