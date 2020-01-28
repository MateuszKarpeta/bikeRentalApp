package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.stereotype.Repository;
import pl.bikepoint.bikeRentalApp.model.person.Address;
import pl.bikepoint.bikeRentalApp.model.person.Customer;

import java.util.Set;

@Repository
public interface CustomerRepository extends CrudService <Customer,Long>{
    Set<Customer> findAll();

    Address findById(Customer id);

    Customer save(Customer object);

    void deleteById(Customer id);
}
