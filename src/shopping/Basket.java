package shopping;

import java.util.ArrayList;
import java.util.List;

public class Basket implements ProductContainer {
    private List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        this.products.add(product);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}
