

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
        return ""+time;
    }

    public int getSeats(){
        return seats;
    }

    public int getAvailableSeats(){
        return availableSeats;
    }

    public void bookSeat() {
        this.availableSeats--;
    }
}

