package pl.bikepoint.bikeRentalApp.services.bike;

import pl.bikepoint.bikeRentalApp.dto.bike.BikeDto;

import java.util.List;

public interface BikeService {

    List<BikeDto> findAllBikes(BikeDto bikeDto);

    void deleteBikeById (Long id);

    void addBike(BikeDto bikeDto);

   // void editBike (BikeDto bikeDto, Long id);

}
