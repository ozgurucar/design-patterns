package org.ozgurucar.decorator;

public class NormalReport implements Report{
    private String text;

    public NormalReport(String text) {
        this.text = text;
    }


    @Override
    public String getText() {
        return text;
    }
}
