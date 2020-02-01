package pl.bikepoint.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bikepoint.rental.dao.contract.OrderDao;

public interface OrderRepository extends JpaRepository<OrderDao, Long> {
}
