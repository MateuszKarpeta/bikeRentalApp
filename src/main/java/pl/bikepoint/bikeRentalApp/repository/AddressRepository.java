package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.bikeRentalApp.model.person.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
