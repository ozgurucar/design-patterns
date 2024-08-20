package org.ozgurucar.adapter;

public class Iron implements HomeAppliance{
    private int volt;

    public Iron() {
        this.volt = 220;
    }

    @Override
    public int plugIn() {
        System.out.println("Iron is working");
        return volt;
    }
}
