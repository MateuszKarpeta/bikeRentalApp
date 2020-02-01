package pl.bikepoint.rental.services;

import pl.bikepoint.rental.dto.bike.BikeDto;
import pl.bikepoint.rental.dto.contract.OrderDto;

import java.util.List;

public interface BikeService {

    List<BikeDto> findAllBikes();

    void deleteBikeById (Long id);

    void addBike(BikeDto bikeDto);

    float calculatePrice(BikeDto bikeDto, OrderDto orderDto);

}
