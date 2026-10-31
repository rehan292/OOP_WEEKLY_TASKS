package hospitalLab;

public class appointment {
    private final String appointmentID;
    private String patientName;
    private String date;
    private String time;
    private String status;
    private int[] waitingTimes = new int[3];
    public static int appointmentCount = 0;
    private double averageWait;

    public appointment(String appointmentID, String patientName, String date, String time, int[] waitingTimes) {
        this.appointmentID = appointmentID;
        this.patientName = patientName;
        this.date = date;
        this.time = time;
        this.waitingTimes = waitingTimes;
        status = "pending";
        appointmentCount++;
        averageWait = 0;
    }

    public void reschedule(String time, String date) {
        this.time = time;
        this.date = date;
        status = "scheduled";
        System.out.println(appointmentID + " resheduled " + date + " " + time);

    }

    public void checkIn() {
        if (status == "canceled" || status == "pending") {
            System.out.println("Checkin denied : appointment " + status);
            return;
        }
        System.out.println("checkin successful");
        status = "pending";

    }

    public void cancel() {
        if (status == "canceled") {
            System.out.println("already cancled");
            return;
        } else if (status == "pending") {
            System.out.println("appointment not shedculed");
            return;
        }
        status = "canceled";
        System.out.println(appointmentID + " " + status);
    }

    public void calculateAverageWait() {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + waitingTimes[i];
        }
        averageWait = sum / waitingTimes.length;
    }

    public void displayAppointment() {
        System.out.println(appointmentID + " | " + date + " " + time + " | " + status + " | Avg wait : " + averageWait);
    }

}
