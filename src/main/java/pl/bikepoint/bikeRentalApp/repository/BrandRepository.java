package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.bikeRentalApp.model.bike.Brand;

public interface BrandRepository extends JpaRepository<Brand,Long> {
}
