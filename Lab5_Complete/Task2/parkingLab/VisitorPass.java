package parkingLab;

public class VisitorPass {
    private final String passid;
    private String visitorName;
    private boolean status;

    public VisitorPass(String passid, String visitorName, boolean status) {
        this.passid = passid;
        this.visitorName = visitorName;
        this.status = status;
    }

    public String getPassId() {
        return passid;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public boolean getStatus() {
        return status;
    }

    public void activate() {
        status = true;
    }

    public void deactivate() {
        status = false;
    }

    public void displaypass() {
        System.out.println(passid + " | " + visitorName + " Active : " + status);
    }
}
