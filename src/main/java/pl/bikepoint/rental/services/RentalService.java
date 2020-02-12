package pl.bikepoint.rental.services;

import pl.bikepoint.rental.dao.contract.Order;
import pl.bikepoint.rental.dao.contract.RentalDetails;
import pl.bikepoint.rental.dao.contract.User;

import java.util.List;

public interface RentalService {
    void rentBike(Order order, RentalDetails rental, User user);

    List<Order> findAllRentals();
}
