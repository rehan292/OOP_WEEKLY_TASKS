package rideLab;

public class Ride {
    private final String rideId;
    private String pickup;
    private String destination;
    private double estimatedFare;
    private int[] stageMinutes = new int[3];
    private String status;
    public static int rideCount = 0;
    private int totalTravelMinutes;

    public Ride(String rideId, String pickup, String destination, double estimatedFare, int[] stageMinutes) {
        this.rideId = rideId;
        this.pickup = pickup;
        this.destination = destination;
        this.estimatedFare = estimatedFare;
        this.stageMinutes = stageMinutes;
        status = "driver arriving";
        rideCount++;
    }

    public String getRideId() {
        return rideId;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getEstimatedFare() {
        return estimatedFare;
    }

    public int[] getStageMinutes() {
        return stageMinutes;
    }

    public String getStatus() {
        return status;
    }

    public static int getRideCount() {
        return rideCount;
    }

    public int getTotalTravelMinutes() {
        return totalTravelMinutes;
    }

    public void startRide() {
        if (status == "driver arriving") {
            status = "in progress";
            System.out.println(rideId + " | status : " + status);
        } else if (status == "in progress" || status == "completed") {
            System.out.println("ride cannot be started");
        }

    }

    public void completeRide(int finalFare) {
        if (status == "in progress") {
            status = "completed";
            estimatedFare = finalFare;
            System.out.println(rideId + " | status : " + status + " | final fare : " + estimatedFare);
        } else {
            System.out.println("ride cannot be completed before it starts.");
        }

    }

    public void calculateTotalTravelMinutes() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + stageMinutes[i];
        }
        totalTravelMinutes = sum;
    }

    public void displayRide() {
        System.out
                .println(rideId + " | " + pickup + "  to " + destination + " | " + totalTravelMinutes + " minutes | "
                        + status);
    }

}
