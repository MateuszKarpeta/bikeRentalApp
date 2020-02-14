package pl.bikepoint.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bikepoint.rental.dao.contract.Discount;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, String> {
    Discount findByNameIgnoreCase(String name);
}
