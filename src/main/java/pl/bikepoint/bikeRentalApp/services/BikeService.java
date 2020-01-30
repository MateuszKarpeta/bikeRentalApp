package pl.bikepoint.bikeRentalApp.services;

import pl.bikepoint.bikeRentalApp.dto.bike.BikeDto;
import pl.bikepoint.bikeRentalApp.dto.contract.OrderDto;

import java.math.BigDecimal;
import java.util.List;

public interface BikeService {

    List<BikeDto> findAllBikes();

    void deleteBikeById (Long id);

    void addBike(BikeDto bikeDto);

    float calculatePrice(BikeDto bikeDto, OrderDto orderDto);

   // void editBike (BikeDto bikeDto, Long id);

}
