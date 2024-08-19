package org.ozgurucar.builder;

public class HouseBuilder {
    private String province;
    private String district;
    private String neighborhood;

    private int roomCount;
    private int bathroomCount;
    private int toiletCount;
    private int balconyCount;

    private boolean isDuplex;
    private boolean isFurnished;
    private boolean hasCarPark;
    private boolean hasPlayground;
    private boolean hasPool;

    public static HouseBuilder startNormalHouseBuild(String province, String district, String neighborhood, int roomCount) {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.province = province;
        houseBuilder.district = district;
        houseBuilder.neighborhood = neighborhood;
        houseBuilder.roomCount = roomCount;

        return houseBuilder;
    }

    public static HouseBuilder startPoolHouseBuild(String province, String district, String neighborhood, int roomCount) {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.province = province;
        houseBuilder.district = district;
        houseBuilder.neighborhood = neighborhood;
        houseBuilder.roomCount = roomCount;
        houseBuilder.hasPool = true;

        return houseBuilder;
    }

    public House build() {
        House house = new House();

        house.setProvince(province);
        house.setDistrict(district);
        house.setNeighborhood(neighborhood);

        house.setRoomCount(roomCount);
        house.setBathroomCount(bathroomCount);
        house.setToiletCount(toiletCount);
        house.setBalconyCount(balconyCount);

        house.setDuplex(isDuplex);
        house.setFurnished(isFurnished);
        house.setHasCarPark(hasCarPark);
        house.setHasPlayground(hasPlayground);
        house.setHasPool(hasPool);

        return house;
    }

    public HouseBuilder setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
        return this;

    }

    public HouseBuilder setToiletCount(int toiletCount) {
        this.toiletCount = toiletCount;
        return this;

    }


    public HouseBuilder setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
        return this;

    }

    public HouseBuilder setDuplex(boolean duplex) {
        isDuplex = duplex;
        return this;

    }

    public HouseBuilder setFurnished(boolean furnished) {
        isFurnished = furnished;
        return this;

    }

    public HouseBuilder setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
        return this;

    }

    public HouseBuilder setHasPlayground(boolean hasPlayground) {
        this.hasPlayground = hasPlayground;
        return this;

    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;

    }
}
