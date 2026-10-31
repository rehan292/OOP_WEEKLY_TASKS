package FoodLab;

public class RestaurantOffer {
    private final String offerid;
    private String description;
    private int discountPercent;

    public RestaurantOffer(String offerid, String description, int discountPercent) {
        this.offerid = offerid;
        this.description = description;
        setDiscountPercent(discountPercent);
    }

    public void setDiscountPercent(int discouontPercent) {
        if (discouontPercent < 0 && discouontPercent >= 100) {
            System.out.println("invalid discountpercentage");
            return;
        }
        this.discountPercent = discouontPercent;

    }

    public void displayOffer() {
        System.out.println(offerid + " | " + description + " | " + discountPercent + "%");
    }

}
