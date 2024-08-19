package org.ozgurucar.builder;

public class House {
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

    public House() {

    }

    public House(String province, String district, String neighborhood, int roomCount, int bathroomCount, int toiletCount, int balconyCount, boolean isDuplex, boolean isFurnished, boolean hasCarPark, boolean hasPlayground, boolean hasPool) {
        this.province = province;
        this.district = district;
        this.neighborhood = neighborhood;
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
        this.toiletCount = toiletCount;
        this.balconyCount = balconyCount;
        this.isDuplex = isDuplex;
        this.isFurnished = isFurnished;
        this.hasCarPark = hasCarPark;
        this.hasPlayground = hasPlayground;
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", roomCount=" + roomCount +
                ", bathroomCount=" + bathroomCount +
                ", toiletCount=" + toiletCount +
                ", balconyCount=" + balconyCount +
                ", isDuplex=" + isDuplex +
                ", isFurnished=" + isFurnished +
                ", hasCarPark=" + hasCarPark +
                ", hasPlayground=" + hasPlayground +
                ", hasPool=" + hasPool +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getBathroomCount() {
        return bathroomCount;
    }

    public void setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
    }

    public int getToiletCount() {
        return toiletCount;
    }

    public void setToiletCount(int toiletCount) {
        this.toiletCount = toiletCount;
    }

    public int getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasCarPark() {
        return hasCarPark;
    }

    public void setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
    }

    public boolean isHasPlayground() {
        return hasPlayground;
    }

    public void setHasPlayground(boolean hasPlayground) {
        this.hasPlayground = hasPlayground;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }
}
