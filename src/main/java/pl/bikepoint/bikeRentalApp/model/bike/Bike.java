package pl.bikepoint.bikeRentalApp.model.bike;

import pl.bikepoint.bikeRentalApp.model.enums.BikeType;
import pl.bikepoint.bikeRentalApp.model.enums.FrameSize;
import pl.bikepoint.bikeRentalApp.model.rentalItem.RentalItem;

public class Bike extends RentalItem {
    private Long bikeId;
    private String bikeName;
    private BikeType bikeType;
    private String generalInfo;
    private String specification;
    private FrameSize frameSize;

}
