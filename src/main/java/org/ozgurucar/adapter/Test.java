package org.ozgurucar.adapter;

public class Test {
    public static void main(String[] args) {
        Socket socket = new Socket();
        Iron iron = new Iron();
        Refrigerator refrigerator = new Refrigerator();

        socket.start(iron);
        socket.start(refrigerator);

        SamsungPhone samsungPhone = new SamsungPhone();
        PhoneHomeApplianceAdapter phoneHomeApplianceAdapter = new PhoneHomeApplianceAdapter(samsungPhone);
        socket.start(phoneHomeApplianceAdapter);

    }
}
