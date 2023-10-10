package shopping;

import java.util.List;

public class CashRegister {

    private List<RegisteredItem> registeredItems;

    public void readCode(String code) {
        registeredItems.add(new RegisteredItem("resolved name for" + code,10));
    }

    public int sumOfPrices() {
        return registeredItems.stream().mapToInt(item -> item.price()).sum();
    }

    public String finnishTransaction(Payment payment) {
        registeredItems.clear();
        return "Here's your receipt!";
    }
}
