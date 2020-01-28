package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.bikeRentalApp.dao.bike.BikeDao;

public interface BikeRepository extends JpaRepository<BikeDao, Long> {
}
