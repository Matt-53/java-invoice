package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.*;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
//    private Collection<Product> products = new ArrayList<>();
    private Map<Product, Integer> products = new HashMap<>();
    private BigDecimal netPrice;
    private BigDecimal tax;
    private BigDecimal grossPrice;

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
        if (netPrice == null) {
            return BigDecimal.ZERO;
        }
        return netPrice;
    }

    public BigDecimal getTax() {
        if (tax == null) {
            return BigDecimal.ZERO;
        }
        return tax;
    }

    public BigDecimal getGrossPrice() {
        if (grossPrice == null) {
            return BigDecimal.ZERO;
        }
        return grossPrice;
    }
}
