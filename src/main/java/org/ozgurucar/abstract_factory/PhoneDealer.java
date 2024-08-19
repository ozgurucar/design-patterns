package org.ozgurucar.abstract_factory;

public class PhoneDealer {
    public static void main(String[] args) {

// We reduced if else statements here by using abstract factory design pattern

        S8Factory s8Factory = new S8Factory();
        Phone s8 = s8Factory.getPhone("s8", "2600mA", 4, 6);

        Note8Factory note8Factory = new Note8Factory();
        Phone note8 = note8Factory.getPhone("note8", "3200mA", 5, 7);

        System.out.println(s8);
        System.out.println();
        System.out.println(note8);


    }


}
