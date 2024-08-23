package org.ozgurucar.composite.composite_last;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculationUtil {

    public static BigDecimal getTotalProductPrice(List<Product> productList) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : productList) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        return totalPrice;
    }

    /*public static BigDecimal getTotalPacketPrice(List<Packet> packetList) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Packet packet : packetList) {
            totalPrice = totalPrice.add(packet.getPrice());
        }
        return totalPrice;
    }*/
}
