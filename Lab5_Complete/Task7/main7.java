import rideLab.*;

public class main7 {
    public static void main(String[] args) {
        Ride[] ride = new Ride[2];
        ride[0] = new Ride("R-908", "UCP", "GULBERG", 720, new int[] { 5, 12, 8 });
        ride[1] = new Ride("R-909", "UCP", "JOHAR TOWN", 500, new int[] { 3, 10, 7 });

        for (Ride a : ride) {
            a.calculateTotalTravelMinutes();
            a.displayRide();
        }
        Ride alias = ride[0];
        alias.completeRide(720);
        alias.startRide();
        alias.completeRide(750);
        System.out.println(" total rides created : " + Ride.rideCount);

        driverRating rating = new driverRating("DR-1", 5, "VERY GOOD ");
        rating.displayRating();
    }
}
