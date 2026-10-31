package netflixLab;

public class movie {
    private final String movieID;
    private String title;
    private int durationMinutes;
    private int progressMinutes;
    private int[] sessionMinutes = new int[3];
    public static int movieCount = 0;
    private int totalWatchedMinutes;

    public movie(String movieID, String title, int durationMinutes, int[] sessionMinutes) {
        this.movieID = movieID;
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.sessionMinutes = sessionMinutes;
        progressMinutes = 0;
        totalWatchedMinutes = 0;
        movieCount++;
    }

    public int getProgressMinutes() {
        return progressMinutes;
    }

    public void pauseAt(int minutes) {
        if (minutes > 0 && minutes < durationMinutes) {
            System.out.println("paused at " + minutes + " minutes");
            progressMinutes = minutes;
        } else {
            System.out.println("invalid minutes");
        }
    }

    public void resume() {
        if (progressMinutes < durationMinutes) {
            System.out.println("resumed");

        } else {
            System.out.println("cant resume ... movie duration completed");
        }
    }

    public void calculateTotalWatchedMinutes() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + sessionMinutes[i];
        }
        totalWatchedMinutes = sum;
    }

    public void displayDetails() {
        System.out.println(movieID + " | " + " Progress " + progressMinutes + "/" + durationMinutes
                + " | sesson minutes :" + totalWatchedMinutes);
    }

}
