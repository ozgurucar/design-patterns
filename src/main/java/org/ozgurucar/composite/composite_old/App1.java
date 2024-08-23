package org.ozgurucar.composite.composite_old;

import java.math.BigDecimal;

public class App1 {
    public static void main(String[] args) {

        // This is the bad structural design because by Open-Closed Pattern's rules
        // A project must be open for changes but must not be open for structural changes.
        // In here if we want to add different kind of basket we will face with some issues.

        Product banana = new Product("banana", BigDecimal.TEN);
        Product bread = new Product("bread", BigDecimal.valueOf(5));

        Product mouse = new Product("zowie", BigDecimal.valueOf(150));
        Product keyboard = new Product("logitech", BigDecimal.valueOf(350));
        Packet technologyPacket = new Packet("technology packet");
        technologyPacket.getProductList().add(keyboard);
        technologyPacket.getProductList().add(mouse);

        Basket basket = new Basket("basket");
        basket.getProductList().add(banana);
        basket.getProductList().add(bread);
        basket.getPacketList().add(technologyPacket);

        System.out.println(basket.getTotalPrice());
    }
}
