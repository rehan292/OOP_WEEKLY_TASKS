package instagramlab;

public class InstaAccount {
    private final String username;
    private String displayName;
    private String bio;
    private int[] postLikes;
    private boolean Private;
    private static int accountCount = 0;
    private double averageLikes;

    public InstaAccount(String username, String displayName, String bio, int[] likes) {
        this.username = username;
        setDisplayname(displayName);
        this.bio = bio;
        postLikes = new int[3];
        for (int i = 0; i < 3; i++) {
            postLikes[i] = likes[i];
        }
        accountCount++;
        Private = false;

    }

    public String getUsername() {
        return username;
    }

    public String getBio() {
        return bio;
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayname(String displayName) {
        this.displayName = displayName;
    }

    public void setBio(String bio) {
        if (bio.length() > 150) {
            System.out.println("Bio exceeds 150 characters ");
            return;
        }
        this.bio = bio;
        System.out.println("After alias update  : " + getUsername() + " |  bio :" + getBio());

    }

    public void setPrivate(boolean Private) {
        this.Private = Private;
    }

    public void updatePostLikes(int index, int likes) {
        if (index >= 0 && index < 2)
            postLikes[index] = likes;
        else {
            System.out.println("invalid Index or likes ");
        }
    }

    public double calculateAverageLikes() {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + postLikes[i];
        }
        double avg = (sum / postLikes.length);
        return avg;

    }

    public void displayDetails() {
        System.out.println(username + " | " + "bio :" + getBio() + " | " + calculateAverageLikes());
    }
}
