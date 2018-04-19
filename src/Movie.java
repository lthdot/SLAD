import java.util.ArrayList;

public class Movie {    //Class type for movies.
    private String title;
    private int year;
    private int mins;
    private String rating;
    private String description;
    private ArrayList<Showing> showings;

    public Movie(String t, int y, int m, String r, String d) {
        showings = new ArrayList<Showing>();
        this.title = t;
        this.mins = m;
        this.rating = r;
        this.description = d;
        showings.add(new Showing("1500",50));
        showings.add(new Showing("1800",50));
        showings.add(new Showing("2100",0));
    }

    public ArrayList<Showing> getShowings() {
        return showings;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getMins() {
        return mins;
    }

    public String getRating() {
        return rating;
    }
}
