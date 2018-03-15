import java.util.ArrayList;

public class Cinema {

    ArrayList<Booking> bookings;
    ArrayList<Movie> movies;

    public Cinema() {

        bookings = new ArrayList<Booking>();
        movies = new ArrayList<Movie>();

        movies.add(new Movie("Ready Player One",2018,140,"12A","The film is set in 2045, with the world on the brink of chaos and collapse. But the people have found salvation in the OASIS, an expansive virtual reality universe created by the brilliant and eccentric James Halliday (Mark Rylance). When Halliday dies, he leaves his immense fortune to the first person to find a digital Easter egg he has hidden somewhere in the OASIS, sparking a contest that grips the entire world. When an unlikely young hero named Wade Watts (Tye Sheridan) decides to join the contest, he is hurled into a breakneck, reality-bending treasure hunt through a fantastical universe of mystery, discovery and danger."));
        movies.add(new Movie("Black Panther",2018,134,"12A","Marvel Studios' 'Black Panther' follows T'Challa who, after the events of 'Captain America: Civil War,' returns home to the isolated, technologically advanced African nation of Wakanda to take his place as King. However, when an old enemy reappears on the radar, T'Challa's mettle as King and Black Panther is tested when he is drawn into a conflict that puts the entire fate of Wakanda and the world at risk."));
        movies.add(new Movie("Tomb Raider",2018,120,"12A","Lara Croft is the fiercely independent daughter of an eccentric adventurer who vanished when she was scarcely a teen. Now a young woman of 21 without any real focus or purpose, Lara navigates the chaotic streets of trendy East London as a bike courier, barely making the rent, and takes college courses, rarely making it to class. Determined to forge her own path, she refuses to take the reins of her father's global empire just as staunchly as she rejects the idea that he's truly gone. Advised to face the facts and move forward after seven years without him, even Lara can't understand what drives her to finally solve the puzzle of his mysterious death. Leaving everything she knows behind, Lara goes in search of her dad's last-known destination: a fabled tomb on a mythical island that might be somewhere off the coast of Japan. But her mission will not be an easy one; just reaching the island will be extremely treacherous. Suddenly, the stakes couldn't be higher for Lara, who against the odds and armed with only her sharp mind, blind faith and inherently stubborn spirit must learn to push herself beyond her limits as she journeys into the unknown. If she survives this perilous adventure, it could be the making of her, earning her the name tomb raider."));


        System.out.println(" ______     __     __   __     ______     __    __     ______   ");
        System.out.println("/\\  ___\\   /\\ \\   /\\ \"-.\\ \\   /\\  ___\\   /\\ \"-./  \\   /\\  __ \\  ");
        System.out.println("\\ \\ \\____  \\ \\ \\  \\ \\ \\-.  \\  \\ \\  __\\   \\ \\ \\-./\\ \\  \\ \\  __ \\ ");
        System.out.println(" \\ \\_____\\  \\ \\_\\  \\ \\_\\\\\"\\_\\  \\ \\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_\\ \\_\\");
        System.out.println("  \\/_____/   \\/_/   \\/_/ \\/_/   \\/_____/   \\/_/  \\/_/   \\/_/\\/_/"+'\n');
        getMovies();

    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
    }


    public void addBooking(){
        bookings.add(new Booking(new Adult()));

    }

    public void getMovies(){
        for (int i=0;i<movies.size();i++){
            String t = movies.get(i).getTitle();
            String r = movies.get(i).getRating();
            int m = movies.get(i).getMins();
            ArrayList<Showing> showings = movies.get(i).getShowings();
            System.out.println((i+1)+" - "+t+" - "+r+" - "+m+"mins"+'\n'+"    "+movies.get(i).getShowings());
        }
    }
}
