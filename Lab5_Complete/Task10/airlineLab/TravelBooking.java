package airlineLab;

public class TravelBooking {
    private final String bookingReference;
    String route;
    private String travelDate;
    private String seatNumber;
    private String status;
    private double[] bagWeights = new double[3];
    public static int bookingCount = 0;
    private double totalBaggageWeight;

    public TravelBooking(String bookingReference, String route, String travelDate, String seatNumber,
            double[] bagWeights) {
        this.bookingReference = bookingReference;
        this.route = route;
        this.travelDate = travelDate;
        this.seatNumber = seatNumber;
        this.bagWeights = bagWeights;
        status = "confirmed";
        bookingCount++;
        totalBaggageWeight = 0;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void changeSeat(String seatNumber) {
        if (status == "checked-in") {
            System.out.println("seat change denied after check-in");
            return;
        }
        this.seatNumber = seatNumber;
        System.out.println(bookingReference + " seat changed to " + seatNumber);
    }

    public void checkIn() {
        status = "checked-in";
        System.out.println("check in successful");

    }

    public void calculateTotalBaggageWeight() {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + bagWeights[i];
        }
        totalBaggageWeight = sum;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Reference: " + bookingReference);
        System.out.println("Route: " + route);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Status: " + status);
        System.out.println("Total Baggage Weight: " + totalBaggageWeight);
    }

}
