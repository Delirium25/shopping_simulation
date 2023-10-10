package shopping;

public class Shop {

    public ProductContainer getBasket() {
        return new Basket();
    }

    public boolean hasItem(Item item) {
        return true;
    }

    public Product getProduct(String productName) {
        return new Product(productName, "123");
    }

    public Cashier getCashier() {
        return new Cashier();
    }
}
