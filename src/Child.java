import java.math.BigDecimal;

public class Child extends Ticket {
    public Child() {
        ticket_type = "Child";
        ticket_price = new BigDecimal(4.00);
    }
}