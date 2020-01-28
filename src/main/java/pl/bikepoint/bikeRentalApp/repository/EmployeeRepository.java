package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.bikeRentalApp.model.person.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
