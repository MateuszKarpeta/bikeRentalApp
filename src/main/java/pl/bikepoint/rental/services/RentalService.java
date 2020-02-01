package pl.bikepoint.rental.services;

import pl.bikepoint.rental.dao.contract.Order;
import pl.bikepoint.rental.dao.contract.RentalDuration;

import java.util.List;

public interface RentalService {
    void rentBike(Order order, RentalDuration rental);

    List<Order> findAllRentals();
}
