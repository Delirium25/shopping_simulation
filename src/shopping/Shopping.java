package shopping;

public class Shopping {

    public Shop shop;
    public Customer customer;

    public Shopping(Shop shop, Customer customer) {
        this.shop = shop;
        this.customer = customer;
    }

    public void doShopping() {
        customer.takeContainer(shop.getBasket());
        customer.takeItems(shop);
        customer.goToCashRegister();
        Cashier cashier = shop.getCashier();
        cashier.takeProducts(customer.getContainer().getProducts());
        Payment payment = customer.pay(cashier.getCashRegister().sumOfPrices());
        String receipt = cashier.takePayment(payment);
        customer.takeReceipt(receipt);
    }
}
