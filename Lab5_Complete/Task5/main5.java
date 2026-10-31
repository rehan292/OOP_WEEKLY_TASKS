import darazLab.*;

public class main5 {
    public static void main(String[] args) {
        Product[] product = new Product[2];
        product[0] = new Product("WM-510", "mOUSE", 2499, 18, new double[] { 2500, 2400, 2600 });
        product[1] = new Product("KB-220", "Keyboard", 3499, 6, new double[] { 3400, 3500, 3600 });

        Product Mouse = product[0];

        for (Product a : product) {
            a.calculateAverageCompetitorPrice();
            a.displayProduct();
        }

        if (Mouse == product[0]) {
            System.out.println("equal");

        }

        Mouse.purchase(2);
        Mouse.purchase(88);
        Mouse.setPrice(2399);
        System.out.println("updated via alias : " + Mouse.getProductCode() + " Price : " + product[0].getPrice());
        System.out.println("Product objects created : " + Product.getProductCount());

        sellerNotice notice = new sellerNotice("N-1", "Eid Sale ", true);

        notice.displayNotice();
    }
}
