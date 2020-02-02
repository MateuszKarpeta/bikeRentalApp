package pl.bikepoint.rental.enums;

public enum PedalType {
    STANDARD_FLAT(10),
    SHIMANO_SPD(20);

    private int price;

    PedalType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
