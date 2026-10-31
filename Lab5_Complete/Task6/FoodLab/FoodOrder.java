package FoodLab;

public class FoodOrder {
    private final String orderID;
    private String customerName;
    private String address;
    private double[] itemPrices = new double[3];
    private String status;
    public static int orderCount = 0;
    private double itemsTotal;

    public FoodOrder(String orderID, String customerName, String address, double[] itemPrices) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.address = address;
        this.itemPrices = itemPrices;
        status = "pending";
        orderCount++;
    }

    public String getaddress() {
        return address;
    }

    public void setCustomerName(String name) {
        customerName = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus() {
        if (status == "pending") {
            status = "preparing";
        } else if (status == "preparing") {
            status = "ready";
        } else if (status == "ready") {
            status = "picked up";
        } else if (status == "picked up") {
            status = "delivered";
        } else {
            System.out.println("invalid");
        }
        System.out.println(orderID + " Status : " + status);
    }

    public void calculateItemsTotal() {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + itemPrices[i];

        }
        itemsTotal = sum;
    }

    public void cancelOrder() {
        if (status == "picked up" || status == "delivered") {
            System.out.println("order cannnot be canceled after pickup or dilervy");
        } else if (status == "canceled") {
            System.out.println("order is already canceled");

        } else {
            status = "canceled";
            System.out.println("order canceled" + orderID);
        }
    }

    public void displayOrder() {
        System.out.println(orderID + " | " + customerName + " | " + itemsTotal + " | " + status);
    }

}
