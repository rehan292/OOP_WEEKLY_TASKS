import netflixLab.*;

public class main8 {
    public static void main(String[] args) {
        movie[] mv = new movie[2];
        mv[0] = new movie("Interstaller", "Interstaller", 169, new int[] { 20, 42, 10 });
        mv[1] = new movie("Inception", "Inception", 148, new int[] { 30, 20, 15 });
        for (movie a : mv) {
            a.calculateTotalWatchedMinutes();
            a.displayDetails();
        }
        movie alias = mv[0];
        alias.pauseAt(42);

        System.out.println("alias progress " + alias.getProgressMinutes());

        System.out.println("movie objects created  " + alias.movieCount);

        subscription sub = new subscription("P-1", "Standard", 1200);

        sub.display();

    }

}
