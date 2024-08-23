package org.ozgurucar.composite.composite_last;

import java.math.BigDecimal;

public class App2 {
    public static void main(String[] args) {

        // With Priceable interface and PriceCalculationUtil project became compatible with
        // Open-Closed Princible -> we can easily add new baskets, products, packets does not matter.
        // Because each of them implements Priceable interface.

        Product banana = new Product("banana", BigDecimal.TEN);
        Product bread = new Product("bread", BigDecimal.valueOf(5));

        Product mouse = new Product("zowie", BigDecimal.valueOf(150));
        Product keyboard = new Product("logitech", BigDecimal.valueOf(350));
        Packet technologyPacket = new Packet("technology packet");
        technologyPacket.getProductList().add(keyboard);
        technologyPacket.getProductList().add(mouse);

        Basket basket = new Basket("basket");
        basket.getPriceableList().add(banana);
        basket.getPriceableList().add(bread);
        basket.getPriceableList().add(technologyPacket);

        System.out.println(basket.totalPrice());
    }
}
