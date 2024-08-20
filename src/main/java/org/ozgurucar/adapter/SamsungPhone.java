package org.ozgurucar.adapter;

public class SamsungPhone implements Phone{
    private int optimalVoltage;

    public SamsungPhone() {
        this.optimalVoltage = 5;
    }


    @Override
    public int charge() {
        System.out.println("Samsung Phone is Working");
        return optimalVoltage;
    }
}
