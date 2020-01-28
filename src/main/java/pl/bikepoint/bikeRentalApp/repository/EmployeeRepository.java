package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.stereotype.Repository;
import pl.bikepoint.bikeRentalApp.model.person.Employee;

import java.util.Set;

@Repository
public interface EmployeeRepository extends CrudService<Employee, Long> {
    Set<Employee> findAll();

    Employee findById(Employee id);

    Employee save(Employee object);

    void deleteById(Employee id);
}
