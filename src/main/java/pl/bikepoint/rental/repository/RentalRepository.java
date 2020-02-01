package pl.bikepoint.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.rental.dao.contract.RentalDuration;

public interface RentalRepository extends JpaRepository<RentalDuration, Long> {
}
