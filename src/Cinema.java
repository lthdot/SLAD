import java.util.ArrayList;

public class Cinema {

    static ArrayList<Booking> bookings = new ArrayList<Booking>();

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Ready Player One",2018,140,"12A","The film is set in 2045, with the world on the brink of chaos and collapse. But the people have found salvation in the OASIS, an expansive virtual reality universe created by the brilliant and eccentric James Halliday (Mark Rylance). When Halliday dies, he leaves his immense fortune to the first person to find a digital Easter egg he has hidden somewhere in the OASIS, sparking a contest that grips the entire world. When an unlikely young hero named Wade Watts (Tye Sheridan) decides to join the contest, he is hurled into a breakneck, reality-bending treasure hunt through a fantastical universe of mystery, discovery and danger."));
        movies.add(new Movie("Ready Player Two",2018,140,"12A","The film is set in 2045, with the world on the brink of chaos and collapse. But the people have found salvation in the OASIS, an expansive virtual reality universe created by the brilliant and eccentric James Halliday (Mark Rylance). When Halliday dies, he leaves his immense fortune to the first person to find a digital Easter egg he has hidden somewhere in the OASIS, sparking a contest that grips the entire world. When an unlikely young hero named Wade Watts (Tye Sheridan) decides to join the contest, he is hurled into a breakneck, reality-bending treasure hunt through a fantastical universe of mystery, discovery and danger."));
        movies.add(new Movie("Ready Player Three",2018,140,"12A","The film is set in 2045, with the world on the brink of chaos and collapse. But the people have found salvation in the OASIS, an expansive virtual reality universe created by the brilliant and eccentric James Halliday (Mark Rylance). When Halliday dies, he leaves his immense fortune to the first person to find a digital Easter egg he has hidden somewhere in the OASIS, sparking a contest that grips the entire world. When an unlikely young hero named Wade Watts (Tye Sheridan) decides to join the contest, he is hurled into a breakneck, reality-bending treasure hunt through a fantastical universe of mystery, discovery and danger."));
        movies.get(0).getShowings();
        System.out.println(movies.get(0));
        System.out.println(movies.get(0).getShowings());
        bookings.add(new Booking(new Adult()));


    }

    public void addBooking(){
        bookings.add(new Booking(new Adult()));
    }
}
