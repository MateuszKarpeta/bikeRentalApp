package pl.bikepoint.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.rental.dao.contract.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
