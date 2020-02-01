package pl.bikepoint.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.rental.dao.bike.BrandDao;

public interface BrandRepository extends JpaRepository<BrandDao,Long> {
}
