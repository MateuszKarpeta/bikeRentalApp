package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.bikeRentalApp.model.bike.Bike;

import java.util.Optional;

public interface BikeRepository extends JpaRepository<Bike,Long> {
    Bike findBikeByBikeTypeE();
    Bike findBikeByName();

    Optional<Bike> findById (Long id);
    Bike deleteBike (Long bikeId);

    public Bike updateBike ();

    //pageing do wyswietlania informacji
}
