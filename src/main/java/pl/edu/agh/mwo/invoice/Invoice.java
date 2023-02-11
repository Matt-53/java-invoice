package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.*;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
//    private Collection<Product> products = new ArrayList<>();
    private Map<Product, Integer> products = new HashMap<>();


    public void addProduct(Product product) {
        // TODO: implement
    }

    public void addProduct(Product product, Integer quantity) {
//        Ta częsc do arraylisty:
//        for (int i = 0; i < quantity; i++) {
//            products.add(product);
//        }

        this.products.put(product, quantity);
    }

    public BigDecimal getNetPrice() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getTax() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getGrossPrice() {
        return null;
    }
}
