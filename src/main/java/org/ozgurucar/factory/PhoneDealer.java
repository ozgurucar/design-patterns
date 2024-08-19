package org.ozgurucar.factory;

public class PhoneDealer {
    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("s8", "2600mA", 4, 6);
        Phone note8 = PhoneFactory.getPhone("note8", "3000mA", 5, 7);
        System.out.println("**********");
        System.out.println(s8);
        System.out.println("**********");
        System.out.println(note8);

    }
}
