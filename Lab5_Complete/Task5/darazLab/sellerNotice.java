package darazLab;

public class sellerNotice {
    private final String noticeID;
    private String message;
    private boolean active;

    public sellerNotice(String noticeID, String message, boolean active) {
        this.noticeID = noticeID;
        setMessage(message);

        this.active = active;
    }

    public String getNoticeID() {
        return noticeID;
    }

    public String getMessage() {
        return message;
    }

    public boolean isActive() {
        return active;
    }

    public void setMessage(String message) {
        if (message.length() < 1 || message.length() > 100) {
            System.out.println("Invalid message length. It should be between 10 and 100 characters.");
            return;
        }
        this.message = message;
    }

    public void deactivate() {
        active = false;
    }

    public void activate() {
        active = true;
    }

    public void displayNotice() {
        System.out.println("Notice ID: " + noticeID);
        System.out.println("Message: " + message);
        System.out.println("Active: " + active);
    }

}
