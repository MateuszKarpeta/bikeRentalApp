package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.stereotype.Repository;
import pl.bikepoint.bikeRentalApp.model.person.Address;

import java.util.Set;

@Repository
public interface AddressRepository extends CrudService<Address,Long> {
    Set<Address> findAll();

    Address findById(Address id);

    Address save(Address object);

    void deleteById(Address id);
}
