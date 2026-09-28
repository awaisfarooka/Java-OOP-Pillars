package oop.pillars.program;

/**
 *
 * @author Hp
 */
public class ProductEncapsulation {

    class Product {
        private String productName;
        private double price;
        private int quantity;

        public void setProductName(String name) {
            productName = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public static void main(String[] args) {
        ProductEncapsulation obj = new ProductEncapsulation();
        Product product = obj.new Product();

        product.setProductName("Laptop");
        product.setPrice(85000);
        product.setQuantity(2);

        System.out.println("Product Information");
        System.out.println("-------------------");
        System.out.println("Product: " + product.getProductName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
    }
}
