package org.ozgurucar.adapter;

public class Refrigerator implements HomeAppliance{
    private int volt;

    public Refrigerator() {
        this.volt = 220;
    }

    @Override
    public int plugIn() {
        System.out.println("Refrigerator is working");
        return volt;
    }
}
