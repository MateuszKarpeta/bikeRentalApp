package pl.bikepoint.rental.services;

import pl.bikepoint.rental.dao.bike.Bike;

import java.util.List;

public interface BikeService {

    List<Bike> findAllBikes();

    void deleteBikeById(Long id);

    void addBike(Bike bike);
}
