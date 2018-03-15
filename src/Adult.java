import java.math.BigDecimal;

public class Adult extends Ticket {
    public Adult() {
        ticket_type = "Adult";
        ticket_price = new BigDecimal(7.50);
    }
}
