package shopping;

import java.util.List;

public interface ProductContainer {
    void add(Product product);

    List<Product> getProducts();
}
