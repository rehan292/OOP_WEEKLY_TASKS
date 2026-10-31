package rideLab;

public class driverRating {
    private final String ratingid;
    private int stars;
    private String comment;

    public driverRating(String ratingid, int stars, String comment) {
        this.ratingid = ratingid;
        setStars(stars);
        this.comment = comment;
    }

    public String getRatingid() {
        return ratingid;
    }

    public int getStars() {
        return stars;
    }

    public String getComment() {
        return comment;
    }

    public void setStars(int stars) {
        if (stars < 1 || stars > 5) {
            System.out.println("invalid stars");
            return;
        }
        this.stars = stars;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void displayRating() {
        System.out.println("Rating ID: " + ratingid);
        System.out.println("Stars: " + stars);
        System.out.println("Comment: " + comment);
    }
}
