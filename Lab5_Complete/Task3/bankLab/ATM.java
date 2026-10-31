package bankLab;

public class ATM {
    private final String machineiD;
    private String location;
    private boolean working;

    public ATM(String machineiD, String location, boolean working) {
        this.machineiD = machineiD;
        this.location = location;
        setWorking(working);
    }

    public void setWorking(boolean working) {
        this.working = working;

    }

    public void displayATM() {
        System.out.println(machineiD + " | " + location + " | " + "working : " + working);
    }

}
