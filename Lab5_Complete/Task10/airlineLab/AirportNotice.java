package airlineLab;

public class AirportNotice {
    private final String noticeID;
    private String message;
    private boolean active;

    public AirportNotice(String noticeID, String message) {
        this.noticeID = noticeID;
        this.message = message;
        this.active = true;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void displayNotice() {
        if (active) {
            System.out.println("Notice ID: " + noticeID);
            System.out.println("Message: " + message);
            System.out.println("Active: " + active);
        } else {
            System.out.println("Notice is inactive.");
        }
    }
}
