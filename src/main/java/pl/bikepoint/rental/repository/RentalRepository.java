package pl.bikepoint.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.rental.dao.contract.RentalDetails;

public interface RentalRepository extends JpaRepository<RentalDetails, Long> {
}
