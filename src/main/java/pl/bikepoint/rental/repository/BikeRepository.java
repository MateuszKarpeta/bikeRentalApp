package pl.bikepoint.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bikepoint.rental.dao.bike.BikeDao;

@Repository
public interface BikeRepository extends JpaRepository<BikeDao, Long> {
}
