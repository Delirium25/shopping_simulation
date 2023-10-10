package shopping;

import java.util.List;

public class Customer {

    private ProductContainer container;

    private List<Item> shoppingList;

    public void takeContainer(ProductContainer container) {
        this.container = container;
    }

    public void takeItems(Shop shop) {
        shoppingList.stream()
                .filter(item -> shop.hasItem(item))
                .forEach(item -> {
                    for (int i = 0; i < item.amount(); i++) {
                        container.add(shop.getProduct(item.name()));
                    }
                });
    }

    public void goToCashRegister() {
    }

    public ProductContainer getContainer() {
        return container;
    }

    public Payment pay(int total) {
        if (hasEnoughMoney(total)) {
            return new Payment(total, PaymentType.CASH);
        } else {
            throw new RuntimeException("Money not enough!");
        }
    }

    private boolean hasEnoughMoney(int total) {
        return true;
    }

    public void takeReceipt(String receipt) {
    }
}
