package parkingLab;

import java.time.LocalTime;

public class Vehicle {
    private final String regID;
    private String ownerName;
    private int[] recentParkDuration = new int[3];
    private String status;
    static int recordsCreated;
    private double totalHours;

    public Vehicle(String regID, String ownerName, int[] recentParkDuration, String status, double totalHours) {
        this.regID = regID;
        this.ownerName = ownerName;
        for (int i = 0; i < 3; i++) {
            this.recentParkDuration[i] = recentParkDuration[i];

        }
        this.status = status;
        recordsCreated++;
        this.totalHours = totalHours;

    }

    public String getRegID() {
        return regID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getStatus() {
        return status;
    }

    public static int getRecordsCreated() {
        return recordsCreated;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void recordEntry() {
        LocalTime entryTime = LocalTime.now();
        System.out.println("Vehicle with registration ID " + regID + " has entered the parking lot at " + entryTime);
        status = "Parked";
    }

    public void recordExit() {
        LocalTime exitTime = LocalTime.now();
        if (status.equals("Exited")) {
            System.out.println("Exit denied  : Vehicle is not inside ");
            return;
        }
        System.out.println("Vehicle with registration ID " + regID + " has exited the parking lot at " + exitTime);
        status = "Exited";
    }

    public void updateDuration(int index, int duration) {
        recentParkDuration[index] = duration;

    }

    public void calcTotalHours() {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + recentParkDuration[i];
        }
        totalHours = sum;
    }

    public void displayStatus() {
        System.out.println(getRegID() + " | " + "Owner : " + ownerName + " | Total Hours : " + totalHours);
    }
}
