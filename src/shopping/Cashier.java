package shopping;

import java.util.List;

public class Cashier {

    private CashRegister cashRegister;

    public void takeProducts(List<Product> products) {
        products.forEach(product -> cashRegister.readCode(product.code()));
    }

    public CashRegister getCashRegister() {
        return cashRegister;
    }

    public String takePayment(Payment payment) {
        return cashRegister.finnishTransaction(payment);
    }
}
