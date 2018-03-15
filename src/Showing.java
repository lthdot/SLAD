

public class Showing {
    private String time;
    private int seats;
    private int availableSeats;

    public Showing(String t, int s) {
        this.time = t;
        this.seats = s;
        this.availableSeats = s;
    }

    @Override
    public String toString() {
        return "Showing{" +
                "time='" + time + '\'' +
                ", seats=" + seats +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
