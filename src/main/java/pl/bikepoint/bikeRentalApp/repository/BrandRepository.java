package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.bikeRentalApp.dao.bike.BrandDao;

public interface BrandRepository extends JpaRepository<BrandDao,Long> {
}
