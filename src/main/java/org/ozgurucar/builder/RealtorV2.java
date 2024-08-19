package org.ozgurucar.builder;

public class RealtorV2 {

    public static void main(String[] args) {

        // within creating proving, district, nbhd, roomcount values into HouseBuilder constructor they became required, others optional.

        // we can create different versions of builder method.
     House house1 = HouseBuilder.startNormalHouseBuild("Istanbul","Umraniye" ,"Tatlisu",3)
             .setHasPlayground(true)
             .setHasCarPark(true)
             .build();

        House house2 = HouseBuilder.startPoolHouseBuild("Istanbul","Atasehir" ,"Ataturk",3)
                .setHasPlayground(true)
                .setHasCarPark(false)
                .build();

     printHouse(house1);

     printHouse(house2);


    }
    private static void printHouse(House house) {

        System.out.println();

        System.out.println("House added --> "  + house);

        System.out.println("");
    }
}
