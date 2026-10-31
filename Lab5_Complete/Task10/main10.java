import airlineLab.*;

public class main10 {
    public static void main(String[] args) {
        TravelBooking[] booking = new TravelBooking[2];
        booking[0] = new TravelBooking("PKR7A21", "Lahore to Istanbul", "2024-07-15", "18A", new double[] { 10, 5, 2 });
        booking[1] = new TravelBooking("PKR8822", "Lahore to Baku", "2024-07-20", "12C", new double[] { 8, 6, 1 });

        for (TravelBooking a : booking) {
            a.calculateTotalBaggageWeight();
            a.displayBookingDetails();
        }
        TravelBooking Alias = booking[0];
        booking[0].changeSeat("20B");
        Alias.checkIn();
        Alias.changeSeat("22C");
        System.out.println("Alias seat : " + Alias.getSeatNumber());
        System.out.println("total booking created : " + TravelBooking.bookingCount);

        AirportNotice notice = new AirportNotice("N-10", "Gate Change ");
        notice.displayNotice();
    }
}
