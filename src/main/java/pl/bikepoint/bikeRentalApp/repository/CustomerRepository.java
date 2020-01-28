package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.bikeRentalApp.model.person.Customer;

public interface CustomerRepository extends JpaRepository <Customer,Long>{
}
