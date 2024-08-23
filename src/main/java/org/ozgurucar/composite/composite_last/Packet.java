package org.ozgurucar.composite.composite_last;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Packet implements Priceable{
    private String name;

    private List<Product> productList;

    public Packet(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public BigDecimal getPrice() {
        return PriceCalculationUtil.getTotalProductPrice(productList);
    }
}
