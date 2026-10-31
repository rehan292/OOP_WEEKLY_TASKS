package netflixLab;

public class subscription {
    private final String planCode;
    private String planName;
    private int monthlyFee;

    public subscription(String planCode, String planName, int monthlyFee) {
        this.planCode = planCode;
        this.planName = planName;
        this.monthlyFee = monthlyFee;
    }

    public void setMonthlyFee(int fee) {
        monthlyFee = fee;
    }

    public void display() {
        System.out.println(planCode + " | " + planName + " | monthly Fee" + monthlyFee);
    }
}
