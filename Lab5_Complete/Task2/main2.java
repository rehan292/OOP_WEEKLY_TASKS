import parkingLab.Vehicle;
import parkingLab.VisitorPass;

public class main2 {
    public static void main(String[] args) {

        Vehicle[] Vehicles = new Vehicle[2];

        Vehicles[0] = new Vehicle("LHR-1234", "Dr. Ahmed", new int[] { 2, 3, 1 }, "Exited", 6);
        Vehicles[1] = new Vehicle("LHR-5678 ", "Ms . Sara   ", new int[] { 1, 1, 2 }, "Exited", 4);

        for (Vehicle a : Vehicles) {
            a.displayStatus();
        }

        Vehicle Ahmed = Vehicles[0];
        Ahmed.recordEntry();
        Ahmed.recordExit();
        Ahmed.recordExit();
        Ahmed.updateDuration(0, 4);
        Ahmed.calcTotalHours();
        System.out.println("After ALias update : " + Ahmed.getRegID() + " |  Owner :" + Ahmed.getOwnerName()
                + " | Total Hours : " + Ahmed.getTotalHours());

        System.out.println("Parking record Created : " + Vehicle.getRecordsCreated());
        VisitorPass visitor = new VisitorPass("VP-10", "Noor", false);
        visitor.activate();
        visitor.displaypass();
    }

}
