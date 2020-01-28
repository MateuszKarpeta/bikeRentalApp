package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.stereotype.Repository;
import pl.bikepoint.bikeRentalApp.model.bike.Brand;
import pl.bikepoint.bikeRentalApp.model.person.Address;

import java.util.Set;

@Repository
public interface BrandRepository extends CrudService<Brand,Long> {
    Set<Brand> findAll();

    Address findById(Brand id);

    Brand save(Brand object);

    void deleteById(Brand id);
}
