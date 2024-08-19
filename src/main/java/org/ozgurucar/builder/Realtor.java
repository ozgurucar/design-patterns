package org.ozgurucar.builder;

public class Realtor {
    public static void main(String[] args) {

        House house1 = new House();
        house1.setProvince("Istanbul");
        house1.setDistrict("Atasehir");
        house1.setNeighborhood("Ataturk");
        house1.setRoomCount(3);
        house1.setHasPool(true);


        House house2 = new House("Istanbul", "Umraniye", "Yeni Mahalle", 4, 2, 1, 3, false,true, true,true, true);

        printHouse(house1);
        printHouse(house2);
    }

    private static void printHouse(House house) {

        System.out.println();

        System.out.println("House added --> "  + house);

        System.out.println("");
    }
}
