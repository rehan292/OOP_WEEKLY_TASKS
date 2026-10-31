import FoodLab.*;

public class main6 {
    public static void main(String[] args) {
        FoodOrder[] food = new FoodOrder[2];
        food[0] = new FoodOrder("ORD-501", "HAMZA", "RAVI", new double[] { 500, 650, 300 });
        food[1] = new FoodOrder("ORD-502", "Ayesha", "Canal", new double[] { 300, 350, 250 });
        FoodOrder hamza = food[0];
        hamza.calculateItemsTotal();

        hamza.setStatus();
        hamza.displayOrder();
        food[1].calculateItemsTotal();
        food[1].setStatus();
        food[1].displayOrder();
        hamza.setStatus();
        hamza.setStatus();
        hamza.cancelOrder();
        food[1].cancelOrder();
        System.out.println("oder objects created : " + FoodOrder.orderCount);
        RestaurantOffer offer = new RestaurantOffer("OFF-1", "Weekend Deal", 10);
        offer.displayOffer();
    }
}
