package org.ozgurucar.adapter;

public class Socket {
    public void start(HomeAppliance homeAppliance) {
        int volt = homeAppliance.plugIn();
        System.out.println("Socket serving " + volt + " volt");
    }
}
