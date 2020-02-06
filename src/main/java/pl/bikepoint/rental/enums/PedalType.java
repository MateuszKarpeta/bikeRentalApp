package pl.bikepoint.rental.enums;

import lombok.Getter;

@Getter
public enum PedalType {
    STANDARD_FLAT(5,"Standard flat"),
    SHIMANO_SPD(10,"Shimano SPD");

    private int price;
    private String description;

    PedalType(int price, String description) {
        this.price = price;
        this.description = description;
    }
}
