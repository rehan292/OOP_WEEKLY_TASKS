package darazLab;

public class Product {
    private final String productCode;
    private String title;
    private double price;
    private int stock;
    private double[] competitorPrices = new double[3];
    public static int productCount = 0;
    private double averageCompetitorPrice;

    public Product(String productCode, String title, double price, int stock, double[] competitorPrices) {
        this.productCode = productCode;
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.competitorPrices = competitorPrices;
        averageCompetitorPrice = 0;
        productCount++;

    }

    public String getProductCode() {
        return productCode;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public double[] getCompetitorPrices() {
        return competitorPrices;
    }

    public double getAverageCompetitorPrice() {
        return averageCompetitorPrice;
    }

    public static int getProductCount() {
        return productCount;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("invalid price ");
            return;
        }
        this.price = price;
    }

    public void purchase(int quantity) {
        if (quantity < 0 || quantity > stock) {
            System.out.println("insufficient Stock");
            return;
        }
        stock = stock - quantity;
        System.out.println("Purchase completed Remaining Stock : " + stock);
    }

    public void isAvailable() {
        if (stock > 0) {
            System.out.println("yes product is in stock ... total items remaining : " + stock);
        } else {
            System.out.println("product is not in stock ");
        }
    }

    public void calculateAverageCompetitorPrice() {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + competitorPrices[i];
        }
        averageCompetitorPrice = sum / (competitorPrices.length);
    }

    public void displayProduct() {
        System.out.println(productCode + " | " + title + " | price : " + price + " | Stock : " + stock
                + " | average Competitor : " + averageCompetitorPrice);
    }

}
