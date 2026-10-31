import hospitalLab.*;

public class main9 {
    public static void main(String[] args) {
        appointment[] ap = new appointment[2];
        ap[0] = new appointment("AP-317", "Farhan", "Monday", "10 : 30 AM ", new int[] { 10, 15, 20 });
        ap[1] = new appointment("AP-318", "Aiman", "Tuesda", "11 : 00 AM ", new int[] { 5, 10, 15 });
        appointment alias = ap[0];
        for (appointment a : ap) {
            a.calculateAverageWait();
            a.displayAppointment();

        }

        alias.reschedule("Monday", "11 : 30 AM");
        ap[1].cancel();
        ap[1].reschedule("monday", "10:30 AM");
        ap[1].cancel();
        ap[1].checkIn();

        System.out.println("appointments created + " + appointment.appointmentCount);

        clinicRoom cr = new clinicRoom("C-12", 2);

        cr.checkInvisitor();
        cr.displayroom();
    }

}
