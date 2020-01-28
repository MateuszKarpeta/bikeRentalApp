package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.stereotype.Repository;
import pl.bikepoint.bikeRentalApp.model.bike.Bike;

@Repository
public interface BikeRepository extends CrudService<Bike, Long> {
    Bike findBikeByBikeTypeE();

    Bike findBikeByName();

    Bike findById(Long id);

    Bike deleteBike(Long bikeId);

    public Bike updateBike();

    //pageing do wyswietlania informacji
}
