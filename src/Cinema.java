import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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

    }

    public static void main(String[] args) {

        //Create Cinema instance
        Cinema cinema = new Cinema();
        int movie = 0;
        int showing = 0;
        String yn = "";

        while (movie == 0){

            //Get Movies
            cinema.getMovies();

            //Select Movie
            Scanner keyboard = new Scanner(System.in);
            System.out.println('\n'+"SELECT MOVIE: ");
            movie = 0;
            try {
                movie = keyboard.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Integers only, please.");
            }

            while (movie > cinema.movies.size() || movie < 1){
                keyboard = new Scanner(System.in);
                System.out.println("SELECT MOVIE: ("+1+"-"+cinema.movies.size()+") ");
                try {
                    movie = keyboard.nextInt();
                } catch (InputMismatchException e){
                    System.out.println("Integers only, please.");
                }
            }
            showing = 0;
            while (showing == 0){
                //Get Showings of selected Movie
                cinema.getShowings(movie-1);

                //Select Showing
                keyboard = new Scanner(System.in);
                showing = 0;
                System.out.println('\n'+"SELECT SHOWING: ");
                try {
                    showing = keyboard.nextInt();
                } catch (InputMismatchException e){
                    System.out.println("INTEGERS ONLY, PLEASE.");
                }

                while (showing > cinema.movies.size()+1 || showing < 1){
                    keyboard = new Scanner(System.in);
                    System.out.println("SELECT SHOWING: ("+1+"-"+cinema.movies.get(movie-1).getShowings().size()+") ");
                    try {
                        showing = keyboard.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("INTEGERS ONLY, PLEASE.");
                    }
                }

                //if "SELECT ANOTHER MOVIE" - restart
                if (showing == cinema.movies.size()+1){
                    movie = 0;
                } else {
                    //else Get Available Seats
                    String a = cinema.getAvailability(movie-1,showing-1);
                    if (a.equals("NO SEATS AVAILABLE")){
                        System.out.println("NO SEATS AVAILABLE");
                        System.out.println("PLEASE SELECT ANOTHER SHOWING");
                        System.out.println("--------------------");
                        showing = 0;
                    } else {
                        yn = "";
                        System.out.println(a);
                        System.out.println("--------------------");
                        while (yn == ""){
                            System.out.println("WOULD YOU LIKE TO BOOK AN ADULT TICKET? (Y/N)");
                            keyboard = new Scanner(System.in);
                            yn = keyboard.next();
                            if (yn.toLowerCase().contains("y")){
                                cinema.addBooking();
                                cinema.movies.get(movie-1).getShowings().get(showing-1).bookSeat();
                                movie = 0;
                            } else if (yn.toLowerCase().contains("n")){
                                System.out.println("PLEASE SELECT ANOTHER SHOWING");
                                System.out.println("--------------------");
                                showing = 0;
                            } else {
                                System.out.println("Y/N ONLY, PLEASE.");
                                yn = "";
                            }
                        }



                    }


                }
            }



        }




    }


    public void addBooking(){
        bookings.add(new Booking(new Adult()));

    }

    public void getMovies(){

        System.out.println("MOVIES CURRENTLY SHOWING");
        for (int i=0;i<movies.size();i++){
            String t = movies.get(i).getTitle();
            String r = movies.get(i).getRating();
            int m = movies.get(i).getMins();
            System.out.println((i+1)+" - "+t+" - "+r+" - "+m+"mins"+'\n'+"    "+movies.get(i).getShowings());
        }
    }

    public void getShowings(int m){

        String t = movies.get(m).getTitle();
        String r = movies.get(m).getRating();
        int mins = movies.get(m).getMins();
        String d = movies.get(m).getDescription();


        System.out.println(t+" - "+r+" - "+mins+"mins"+"\n");

        String[] desc = d.split("\\s");
        int step = 15;
        String desc2 = "";
        for (int i =0;i<desc.length;i++){
            desc2 = desc2+desc[i]+" ";
            if (i > 0 && i % step == 0) {
                System.out.print(desc2 + "\n");
                desc2 = "";
            }
        }

        ArrayList<Showing> times = movies.get(m).getShowings();

        System.out.println("\n"+"TODAY'S SHOWING TIMES");
        for (int i =0;i<times.size()+1;i++){
            if (i==times.size()){
                System.out.println((i+1)+" - SELECT ANOTHER MOVIE");
            } else {
                if (times.get(i).getAvailableSeats()==0){
                    System.out.println((i+1)+" - "+times.get(i)+" - FULLY BOOKED");
                } else {
                    System.out.println((i+1)+" - "+times.get(i));
                }

            }


        }
    }

    public String getAvailability(int m, int s){
        String available;
        ArrayList<Showing> times = movies.get(m).getShowings();
        int availableSeats = times.get(s).getAvailableSeats();
        if (availableSeats == 0){
            available = "NO SEATS AVAILABLE";
        } else {
            int seats = times.get(s).getSeats();
            available = "AVAILABLE SEATS: "+availableSeats+"/"+seats;
        }
        return available;
    }
}
