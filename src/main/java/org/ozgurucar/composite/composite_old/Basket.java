package org.ozgurucar.composite.composite_old;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private String name;
    private List<Product> productList;
    private List<Packet> packetList;

    public Basket(String name) {
        this.name = name;
        this.packetList = new ArrayList<>();
        this.productList = new ArrayList<>();
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for(Product product: productList) {
            totalPrice = totalPrice.add(product.getPrice());
        }

        for(Packet packet: packetList) {
            List<Product> products = packet.getProductList();

            for(Product product: products) {
                totalPrice = totalPrice.add(product.getPrice());
            }
        }
        return  totalPrice;
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

    public List<Packet> getPacketList() {
        return packetList;
    }

    public void setPacketList(List<Packet> packetList) {
        this.packetList = packetList;
    }
}
